name := """hornbach_timeRecording"""
organization := "de.unimannheim"

version := "1.0-SNAPSHOT"

scalaVersion := "2.12.2"

lazy val myProject = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

libraryDependencies ++= Seq(
  jdbc,
  evolutions,
  guice,
  "com.h2database" % "h2" % "1.4.194",
  javaJpa,
  "org.hibernate" % "hibernate-core" % "5.2.5.Final",
  filters
)

// Compile the project before generating Eclipse files, so that generated .scala or .class files for views and routes are present
EclipseKeys.preTasks := Seq(compile in Compile, compile in Test)

PlayKeys.externalizeResources := false