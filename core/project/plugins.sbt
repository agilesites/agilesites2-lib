val plugin = project.in(file(".")).dependsOn( (file("..") / "plugin").toURI)

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.5.0")

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.7.4")

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.5.1")

//addSbtPlugin("org.scala-sbt.plugins" % "sbt-xjc" % "0.7")
