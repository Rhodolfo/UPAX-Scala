// Settings used by all projects
lazy val commonSettings = Seq(
	organization := "com.upax-research",
	version := "1.0.0",
	scalaVersion := "2.12.1")

// Main project
lazy val root = (project in file("src"))
	.settings(commonSettings: _*)
	.settings(name := "Main")
