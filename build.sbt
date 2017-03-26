name := "sKaLa"

version := "1.0"

scalaVersion := "2.12.1"

autoScalaLibrary := true

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-library" % scalaVersion.value,
  "org.scala-lang" % "scala-reflect" % scalaVersion.value,
  "org.scala-lang" % "scala-compiler" % scalaVersion.value
)
