//addSbtPlugin("com.sciabarra" % "agilesites2-build" % "1.9-M11-SNAPSHOT")
val plugin = project.in(file(".")).dependsOn(url("file:///A:/Dropbox/Products/sciabarra/AgileSites2/agilesites2-build").toURI)

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.5.0")

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.5.1")

addSbtPlugin("me.lessis" % "bintray-sbt" % "0.1.2")

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.7.4")

addSbtPlugin("com.typesafe.sbt" % "sbt-mocha" % "1.0.2")
