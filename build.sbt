// This build is for this Giter8 template.
// To test the template run `g8` or `g8Test` from the sbt session.
// See http://www.foundweekends.org/giter8/testing.html#Using+the+Giter8Plugin for more details.
ThisBuild / organization := "com.rmet"
lazy val python3_seed_g8 = (project in file("."))
  .enablePlugins(ScriptedPlugin)
  .settings(
    name := "python3-seed.g8",
    test in Test := {
      val _ = (g8Test in Test).toTask("").value
    },
    scriptedLaunchOpts ++= List(
      "-Xms1024m",
      "-Xss1024m",
      "-Xmx1024m",
      "-XX:ReservedCodeCacheSize=128m",
      "-Xss2m",
      "-Dfile.encoding=UTF-8"
    ),
    resolvers += Resolver.url(
      "typesafe",
      url("https://repo.typesafe.com/typesafe/ivy-releases/")
    )(Resolver.ivyStylePatterns)
  )
