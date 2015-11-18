lazy val root = (project in file(".")).
  settings(
  name := "intellij-sbt-relative-path",
  version := "1.0.0",
  scalaVersion := "2.11.7"
  )

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"
libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"

testOptions += Tests.Argument(TestFrameworks.JUnit, "-q", "-v")
