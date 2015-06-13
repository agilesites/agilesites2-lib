val v = scala.io.Source.fromFile((file("..") / "version.txt").getAbsolutePath).getLines.next.trim

val asPackage = taskKey[Unit]("deploy the lib to destination")

val asPackageTask = asPackage := {
  val location = file("target.txt")
  if (!location.exists)
    throw new java.io.FileNotFoundException("Not found 'target.txt' - Please create one to specify destination.")
  val dst = file(scala.io.Source.fromFile(location).getLines.next.trim)
  val src = (Keys.`package` in Compile).value
  IO.copyFile(src, dst)
  println(s"+++ ${dst}")
  println(
    """ ***************************************************
      | **** You need to restart to use the new jar!!! ****
      | ***************************************************""".stripMargin)
}

def settingsByVersion(ver: String) = Seq(asPackageTask,
  name := "agilesites2-core",
  organization := "com.sciabarra",
  version := ver + "_" + v,
  scalaVersion := "2.11.5",
  crossPaths := false,
  autoScalaLibrary := false,
  javacOptions ++= Seq("-g", "-Xlint:unchecked", "-source", "1.6", "-target", "1.6"),
  scalacOptions ++= Seq("-target:jvm-1.6"),
  resolvers += Resolver.mavenLocal,
  unmanagedSourceDirectories in Compile ++= Seq(
    baseDirectory.value / ver / "src" / "main" / "java"),
  unmanagedResourceDirectories in Compile ++= Seq(
    baseDirectory.value / ver / "src" / "main" / "resources"),
  libraryDependencies ++= Seq(
       //"com.novocode" % "junit-interface" % "0.9" % "test",
        //"org.xeustechnologies" % "jcl-core" % "2.2.1",
       "javax.servlet" % "servlet-api" % "2.5" % "provided",
       "log4j" % "log4j" % "1.2.16" % "provided",
       "commons-io" % "commons-io" % "1.4",
       "org.apache.lucene" % "lucene-core" % "2.9.2" % "provided",
       "com.oracle.sites" % "gator" % ver % "provided",
       "com.oracle.sites" % "cs-core" % ver % "provided",
       "com.oracle.sites" % "cs" % ver % "provided",
       "com.oracle.sites" % "lucene-search" % ver % "provided",
       "com.oracle.sites" % "xcelerate" % ver % "provided",
       "com.oracle.sites" % "assetapi" % ver % "provided") ++
       (if(!ver.startsWith("12."))
        Seq("com.oracle.sites" % "assetapi-impl" % ver % "provided")
       else Seq()) ++
       (if(ver.startsWith("11.")) 
         Seq("com.oracle.sites" % "wem-sso-api" % ver % "provided") 
       else Seq()) ++
       (if(ver.startsWith("12.")) 
         Seq("com.oracle.sites" % "wem-sso-api" % ver % "provided") 
       else Seq())
  )

/*
val btSettings = bintrayPublishSettings ++ Seq(
  bintray.Keys.bintrayOrganization in bintray.Keys.bintray := Some("sciabarra"),
  bintray.Keys.repository in bintray.Keys.bintray := "maven",
  licenses +=("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0.html")),
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

val core = project.in(file(".")).
  enablePlugins(AgileSitesLibPlugin).
  settings(settingsByVersion(  Option(System.getProperty("ver")) getOrElse "11.1.1.8.0"  ): _*).
  settings(btSettings: _*)
