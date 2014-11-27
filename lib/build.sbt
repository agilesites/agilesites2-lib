val v = scala.io.Source.fromFile( (file("..")/"version2.txt").getAbsolutePath).getLines.next.trim

def settingsByVersion(ver: String, extraDir: File) = Seq(
    name := "agilesites2-lib",
    organization := "com.sciabarra",
    version := ver + "_" + v,
    scalaVersion := "2.10.4",
    crossPaths := false,
    javacOptions in Compile += "-g",
    resolvers += Resolver.mavenLocal,
	unmanagedSourceDirectories in Compile += extraDir / "src" / "main" / "java",
  	unmanagedResourceDirectories in Compile += extraDir/ "src" / "main" / "resources", 
    	libraryDependencies ++= Seq(
         "junit" % "junit" % "4.11",
         "com.novocode" % "junit-interface" % "0.9" % "test",
         "log4j" % "log4j" % "1.2.16" % "provided",
         "com.oracle.sites" % "cs-core" % ver % "provided",
         "com.oracle.sites" % "cs" % ver % "provided",
         "com.oracle.sites" % "xcelerate" % ver % "provided",
         "com.oracle.sites" % "assetapi" % ver % "provided", 
         "com.oracle.sites" % "assetapi-impl" % ver % "provided",
         "com.oracle.sites" % "jsoup" % ver % "provided",
         "com.oracle.sites" % "xstream" % ver % "provided") ++
         (if(ver.startsWith("11.")) Seq("com.oracle.sites" % "wem-sso-api" % ver % "provided") else Seq()))
 
val btsettings = bintrayPublishSettings ++ Seq(
	bintray.Keys.bintrayOrganization in bintray.Keys.bintray := Some("sciabarra"),
	bintray.Keys.repository in bintray.Keys.bintray := "maven",
	licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0.html")),
	publishMavenStyle := true,
	publishArtifact in packageDoc := false,
	publishArtifact in Test := false)

val here = file(".").getAbsoluteFile
    
val lib116 = project.in(file("lib116")).settings(settingsByVersion("11.1.1.6.0", here): _*).settings(btsettings: _*)

val lib762 = project.in(file("lib762")).settings(settingsByVersion("7.5.0", here): _*).settings(btsettings: _*)

//val lib118 = project.in(file(".")).settings(settingsByVersion("11.1.1.8.0", here / "lib118" ): _*)