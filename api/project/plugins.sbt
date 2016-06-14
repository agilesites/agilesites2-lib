resolvers += Resolver.url("sbt plugin", url("http://dl.bintray.com/content/sciabarra/sbt-plugins"))(Resolver.ivyStylePatterns)

resolvers += "sciabarra" at "http://dl.bintray.com/content/sciabarra/maven"

addSbtPlugin("com.sciabarra" % "agilesites2-build" % "2.0.1")

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.5.0")

addSbtPlugin("me.lessis" % "bintray-sbt" % "0.1.2")

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.7.4")


