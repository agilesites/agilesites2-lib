val v = scala.io.Source.fromFile( (file("..")/"version.txt").getAbsolutePath).getLines.next.trim

val asPackage = taskKey[Unit]("deploy the lib to destination")

val asPackageTask = asPackage := {
  val location = file("target.txt")
  if(!location.exists)
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
  version := ver + "_"+v,
  scalaVersion := "2.11.5",
  crossPaths := false,
  resolvers += Resolver.mavenLocal,
  unmanagedSourceDirectories in Compile ++= Seq(
        baseDirectory.value.getParentFile / "src" / "main" / "java"),
  unmanagedResourceDirectories in Compile ++= Seq(
       baseDirectory.value.getParentFile / "src" / "main" / "resources"),
  libraryDependencies ++= Seq(
       //"com.novocode" % "junit-interface" % "0.9" % "test",
        //"org.xeustechnologies" % "jcl-core" % "2.2.1",
       "javax.servlet" % "servlet-api" % "2.5" % "provided",
       "log4j" % "log4j" % "1.2.16" % "provided",
       "commons-io" % "commons-io" % "1.4",
       "com.oracle.sites" % "gator" % ver % "provided",
       "com.oracle.sites" % "cs-core" % ver % "provided",
       "com.oracle.sites" % "cs" % ver % "provided",
       "com.oracle.sites" % "xcelerate" % ver % "provided",
       "com.oracle.sites" % "assetapi" % ver % "provided",
       "com.oracle.sites" % "assetapi-impl" % ver % "provided") ++
       (if(ver.startsWith("11.")) 
         Seq("com.oracle.sites" % "wem-sso-api" % ver % "provided") 
       else Seq()))

val btSettings = bintrayPublishSettings ++ Seq(
	bintray.Keys.bintrayOrganization in bintray.Keys.bintray := Some("sciabarra"),
	bintray.Keys.repository in bintray.Keys.bintray := "maven",
	licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0.html")),
	publishMavenStyle := true,
	publishArtifact in packageDoc := false,
	publishArtifact in Test := false)

val core118 = project.in(file("core118")).enablePlugins(AgileSitesLibPlugin).settings(settingsByVersion("11.1.1.8.0"): _*).settings(btSettings: _*)

val core116 = project.in(file("core116")).enablePlugins(AgileSitesLibPlugin).settings(settingsByVersion("11.1.1.6.0"): _*).settings(btSettings: _*)

val core762 = project.in(file("core762")).enablePlugins(AgileSitesLibPlugin).settings(settingsByVersion("7.5.0"): _*).settings(btSettings: _*)

val core = project.in(file(".")).settings(sources in Compile := Seq())
