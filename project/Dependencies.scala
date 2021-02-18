import sbt._

object Dependencies {

  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.2.0"
  lazy val lagomClient = "com.lightbend.lagom" %% "lagom-scaladsl-client" % "1.6.4"
  lazy val lagomTest = "com.lightbend.lagom" %% "lagom-scaladsl-testkit" % "1.6.4" % Test
  lazy val lagomServer = "com.lightbend.lagom" %% "lagom-scaladsl-server" % "1.6.4"
  lazy val playHttp = "com.typesafe.play" %% "play-akka-http-server" % "2.8.1"

}
