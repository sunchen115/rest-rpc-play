
name := "rest-rpc-play"

version := "1.0"

organization := "TW"

scalaVersion := "2.11.4"

libraryDependencies +=  "org.specs2" %% "specs2" % "2.4.17" % "test"

for (c <- Seq(Compile, Test)) yield {
  haxeOptions in c ++= Seq("-dce", "no")
}
    