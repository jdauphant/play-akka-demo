name := """play-akka-demo"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

resolvers ++= Seq(
  "Scalaz Bintray Repo" at "https://dl.bintray.com/scalaz/releases"
)

libraryDependencies ++= Seq(
  specs2 % Test
)

routesGenerator := InjectedRoutesGenerator
