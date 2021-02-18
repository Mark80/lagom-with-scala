import Dependencies._

name := "lagom-with-scala"

version := "0.1"

scalaVersion := "2.13.4"

lazy val `hello` = (project in file("."))
  .aggregate(`hello-api`, `hello-impl`)

lazy val `hello-api` = (project in file("hello-api"))
  .settings(libraryDependencies ++= Seq(lagomScaladslApi))

lazy val `hello-impl` = (project in file("hello-impl"))
  .enablePlugins(LagomScala)
  .settings(libraryDependencies ++= Seq(scalaTest))
  .dependsOn(`hello-api`)
