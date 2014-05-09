name := "categorizer"

version := "1.0.0-SNAPSHOT"

libraryDependencies ++= List(
  "org.json4s" %% "json4s-native" % "3.2.9",
  "org.json4s" %% "json4s-jackson" % "3.2.9",
  "com.typesafe.slick" %% "slick" % "2.0.1",
  "mysql" % "mysql-connector-java" % "5.1.24",
  "com.h2database" % "h2" % "1.3.176"
)

playScalaSettings

scalariformSettings
