organization := "com.github.esgott"
name := "onlyco"
version := "0.1.0-SNAPSHOT"
scalaVersion := "2.12.12"

enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin)

scalaJSUseMainModuleInitializer := true

jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()

Compile / mainClass := Some("com.github.esgott.onlyco.App")

libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.7.5",
  "com.github.japgolly.scalajs-react" %%% "extra" % "1.7.5"
)

npmDependencies in Compile ++= Seq(
  "react" -> "16.13.1",
  "react-dom" -> "16.13.1"
)
