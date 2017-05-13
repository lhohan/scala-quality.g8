name := "$name$"
organization := "$organization$"
version := "$version$"
scalaVersion := "$scala_version$"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"

import TodoListPlugin._
compileWithTodolistSettings
testWithTodolistSettings
