addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.2")
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.2.0")
addSbtPlugin("ch.epfl.scala" % "sbt-scalajs-bundler" % "0.18.0")

libraryDependencies += "org.scala-js" %% "scalajs-env-jsdom-nodejs" % "1.0.0"