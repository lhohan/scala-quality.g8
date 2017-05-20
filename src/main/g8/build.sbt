name := "$name$"
organization := "$organization$"
version := "$version$"
scalaVersion := "$scala_version$"

scalacOptions ++= Seq(
  "-Xfatal-warnings", // fail compilation in case of warnings
  "-target:jvm-1.8",
  "-encoding", "UTF-8",
  "-unchecked",
  "-deprecation",
  "-explaintypes",
  "-Xfuture",
  "-Yno-adapted-args",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard",
  "-Ywarn-unused",
  "-Ypartial-unification",
  "-feature",
  "-language:higherKinds",
  "-language:implicitConversions"
)

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.3" % "test"

// todos plugin setup
import TodoListPlugin._
compileWithTodolistSettings
testWithTodolistSettings

// wartremover plugin setup
wartremoverErrors ++= Warts.unsafe
// Enable all warts (some generate false positives)
//wartremoverErrors ++= Warts.all
// Generate warnings instead of errors:
//wartremoverWarnings ++= Warts.all
