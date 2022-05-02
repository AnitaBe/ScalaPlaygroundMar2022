ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "ScalaPlaygroundMar2022"
  )

libraryDependencies += "com.lihaoyi" %% "upickle" % "1.6.0"
//I am saying I want this library included in my project above

libraryDependencies += "org.scala-lang.modules" %% "scala-xml" % "2.1.0"
