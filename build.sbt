name := "categorizer"

version := "1.0.0-SNAPSHOT"

scalaVersion  := "2.11.8"

libraryDependencies ++= List(
  "org.json4s" %% "json4s-native" % "3.3.0",
  "org.json4s" %% "json4s-jackson" % "3.3.0",
  "com.typesafe.slick" %% "slick" % "3.1.1",
  "mysql" % "mysql-connector-java" % "5.1.38",
  "com.h2database" % "h2" % "1.4.191"
)

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalariformSettings
