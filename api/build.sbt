val v = scala.io.Source.fromFile( (file("..")/"version.txt").getAbsolutePath).getLines.next.trim

val asPackage = taskKey[Unit]("deploy the lib to destination")

asPackage in Compile := { println("use one of the subprojects")}

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
    scalaVersion := "2.11.5",
    crossPaths := false,
    javacOptions in Compile += "-g",
    resolvers += Resolver.mavenLocal,
	unmanagedSourceDirectories in Compile += baseDirectory.value.getParentFile / "src" / "main" / "java",
  	unmanagedResourceDirectories in Compile += baseDirectory.value.getParentFile / "src" / "main" / "resources", 
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
         "com.oracle.sites" % "assetapi" % ver % "provided", 
         "com.oracle.sites" % "assetapi-impl" % ver % "provided",
         "com.oracle.sites" % "jsoup" % ver % "provided",
         "com.oracle.sites" % "xstream" % ver % "provided",
         "com.oracle.sites" % "basic" % ver % "provided") ++
         (if(ver.startsWith("11.")) Seq("com.oracle.sites" % "wem-sso-api" % ver % "provided") else Seq()))
 
val btsettings = bintrayPublishSettings ++ Seq(
	   bintray.Keys.bintrayOrganization in bintray.Keys.bintray := Some("sciabarra"),
	   bintray.Keys.repository in bintray.Keys.bintray := "maven",
	   licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0.html")),
	   publishMavenStyle := true,
	   publishArtifact in packageDoc := false,
	   publishArtifact in Test := false)

val api118 = project.in(file("api118")).settings(settingsByVersion("11.1.1.8.0"): _*).settings(btsettings: _*)

val api116 = project.in(file("api116")).settings(settingsByVersion("11.1.1.6.0"): _*).settings(btsettings: _*)

val api762 = project.in(file("api762")).settings(settingsByVersion("7.5.0"): _*).settings(btsettings: _*)

val api = project.in(file(".")).aggregate(api118,api116,api762).settings(sources in Compile := Seq())
