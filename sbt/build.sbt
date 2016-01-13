val scalaz = "org.scalaz" %% "scalaz-core" % "7.2.0"

lazy val root = (project in file(".")).
  settings(
    name := "sbt",
    version := "1.0",
    scalaVersion := "2.11.7",
    libraryDependencies += scalaz
  )
