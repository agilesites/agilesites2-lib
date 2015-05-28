val v = scala.io.Source.fromFile( (file("..")/"version.txt").getAbsolutePath).getLines.next.trim

val asPackage = taskKey[Unit]("deploy the lib to destination")

asPackage in Compile := { println("use one of the subprojects")}

resolvers += "Nexus-sciabarra-releases" at "http://nexus.sciabarra.com/content/repositories/releases"
resolvers += "Nexus-sciabarra-snapshots" at "http://nexus.sciabarra.com/content/repositories/snapshots"

def settingsByVersion(ver: String) = Seq(asPackage := {
  val location = file("target.txt")
  if(!location.exists)
    throw new java.io.FileNotFoundException("Not found 'target.txt' - Please create one to specify destination.")
  val dst = file(scala.io.Source.fromFile(location).getLines.next.trim)
  val src = (Keys.`package` in Compile).value
  IO.copyFile(src, dst)
  println(s"+++ ${dst}")
},
    name := "agilesites2-api",
    organization := "com.sciabarra",
    version := ver + "_" + v,
    javacOptions ++= Seq("-g", "-Xlint:unchecked", "-source", "1.6", "-target", "1.6"),
    scalacOptions ++= Seq("-target:jvm-1.6"),
    scalaVersion := "2.11.5",
    crossPaths := false,
    javacOptions in Compile += "-g",
    resolvers += Resolver.mavenLocal,
    libraryDependencies ++= Seq(
         "com.sciabarra" % "agilesites2-core" % version.value % "provided",
         "junit" % "junit" % "4.11",
         "org.mockito" % "mockito-core" % "1.9.5" % "test",
         "org.powermock" % "powermock-api-mockito" % "1.6.1" % "test",
         "org.powermock" % "powermock-module-junit4" % "1.6.1" % "test",
         "com.novocode" % "junit-interface" % "0.9" % "test",
         "log4j" % "log4j" % "1.2.16" % "provided",
         "com.oracle.sites" % "cs-core" % ver % "provided",
         "com.oracle.sites" % "cs" % ver % "provided",
         "com.oracle.sites" % "xcelerate" % ver % "provided",
         "com.oracle.sites" % "gator" % ver % "provided",
         "com.oracle.sites" % "assetapi" % ver % "provided", 
         "com.oracle.sites" % "jsoup" % ver % "provided",
         "com.oracle.sites" % "xstream" % ver % "provided",
         "com.oracle.sites" % "gator" % ver % "provided",
         "com.oracle.sites" % "framework" % ver % "provided",
         "com.oracle.sites" % "cs-cache" % ver % "provided",
         "com.oracle.sites" % "assetframework" % ver % "provided",
         "com.oracle.sites" % "basic" % ver % "provided") ++
         (if(ver.startsWith("11.")) Seq("com.oracle.sites" % "wem-sso-api" % ver % "provided") else Seq()) ++
         (if(!ver.startsWith("12.")) Seq("com.oracle.sites" % "assetapi-impl" % ver % "provided") else Seq()))
 
/*
val publishSetting = bintrayPublishSettings ++ Seq(
	   bintray.Keys.bintrayOrganization in bintray.Keys.bintray := Some("sciabarra"),
	   bintray.Keys.repository in bintray.Keys.bintray := "maven",
	   licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0.html")),
	   publishMavenStyle := true,
	   publishArtifact in packageDoc := false,
	   publishArtifact in Test := false)
*/
val publishSettings = Seq(
  publishMavenStyle := true,
  pomIncludeRepository := { _ => false },
  publishTo := {
    val nexus = "http://nexus.sciabarra.com/"
    if (isSnapshot.value)
      Some("snapshots" at nexus + "content/repositories/snapshots")
    else
      Some("releases"  at nexus + "content/repositories/releases")
  },
  publishArtifact in packageDoc := false,
  publishArtifact in Test := false,
  licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0.html")),
  credentials += Credentials(Path.userHome / ".ivy2" / "credentials")
)

val api = project.in(file(".")).
  settings(settingsByVersion(  Option(System.getProperty("ver")) getOrElse "11.1.1.6.0"  ): _*).
  settings(publishSettings: _*)
