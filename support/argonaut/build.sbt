name := "argonaut-support"

libraryDependencies ++= Seq(
  "io.argonaut" %% "argonaut" % "6.0.4"
)

seq(bintrayResolverSettings: _*)

seq(bintrayPublishSettings: _*)
