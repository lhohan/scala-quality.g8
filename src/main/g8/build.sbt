name := "$name$"
organization := "$organization$"
version := "$version$"
scalaVersion := "$scala_version$"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.3" % "test"

// todos plugin setup
import TodoListPlugin._
compileWithTodolistSettings
testWithTodolistSettings
