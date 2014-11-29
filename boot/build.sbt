val boot = project.in(file(".")).enablePlugins(SbtWeb)

name := "agilesites2-boot"

organization := "com.sciabarra"

version := "1.0-SNAPSHOT"

crossPaths := false

val wcsVersion = "11.1.1.8.0"

val libVersion = "2.0-M1-SNAPSHOT"

resolvers ++= Seq(
	Resolver.mavenLocal,
	"sciabarra" at "http://dl.bintray.com/contents/sciabarra/maven")

//javacOptions += "-g"

libraryDependencies ++= Seq(
	  //"com.sciabarra" % "agilesites2-lib" % s"${wcsVersion}_${libVersion}",
      "com.novocode" % "junit-interface" % "0.9" % "test",
      "org.webjars" % "bootstrap" % "3.2.0",
      "org.webjars" % "html5shiv" % "3.7.2",
      "org.webjars" % "respond" % "1.4.2",
      "org.webjars" % "jquery" % "1.11.1")
    
// adding sources from lib for development
    
unmanagedSourceDirectories in Compile ++= Seq (
	baseDirectory.value.getParentFile / "lib" / "src" / "main" / "java",
	baseDirectory.value.getParentFile / "lib" / "lib118" / "src" / "main" / "java")
      
libraryDependencies ++= Seq(
      "junit" % "junit" % "4.11",
      "log4j" % "log4j" % "1.2.16",
      "com.oracle.sites" % "cs-core" % wcsVersion,
      "com.oracle.sites" % "cs" % wcsVersion,
      "com.oracle.sites" % "xcelerate" % wcsVersion,
      "com.oracle.sites" % "assetapi" % wcsVersion,
      "com.oracle.sites" % "assetapi-impl" % wcsVersion,
      "com.oracle.sites" % "jsoup" % wcsVersion,
      "com.oracle.sites" % "xstream" % wcsVersion,
      "com.oracle.sites" % "jsoup" % wcsVersion,
      "com.oracle.sites" % "xstream" % wcsVersion)
      