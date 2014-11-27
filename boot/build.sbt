val v = "2.0"

val ver = "11.1.1.8.0"

version := s"${ver}_${v}"

name := "agilesites2-boot"

organization := "com.sciabarra"

crossPaths := false

resolvers ++= Seq(
	Resolver.mavenLocal,
	"sciabarra" at "http://dl.bintray.com/contents/sciabarra/maven")

javacOptions += "-g"

libraryDependencies ++= Seq(
      "com.novocode" % "junit-interface" % "0.9" % "test",
      "org.webjars" % "bootstrap" % "3.2.0",
      "org.webjars" % "html5shiv" % "3.7.2",
      "org.webjars" % "respond" % "1.4.2",
      "org.webjars" % "jquery" % "1.11.1")
    
val boot = project.in(file(".")).enablePlugins(SbtWeb)

//.dependsOn((file("..")/"lib").toURI)
      
//      "com.oracle.sites" % "cs-core" % ver,
//      "com.oracle.sites" % "cs" % ver,
//      "com.oracle.sites" % "xcelerate" % ver,
//      "com.oracle.sites" % "assetapi" % ver,
//      "com.oracle.sites" % "assetapi-impl" % ver,
//      "com.oracle.sites" % "jsoup" % ver,
//      "com.oracle.sites" % "xstream" % ver,
//      "com.oracle.sites" % "jsoup" % ver,
//      "com.oracle.sites" % "xstream" % ver,
//      "org.webjars" % "bootstrap" % "3.2.0",
//      "org.webjars" % "html5shiv" % "3.7.2",
//      "org.webjars" % "respond" % "1.4.2",
//      "org.webjars" % "jquery" % "1.11.1")


