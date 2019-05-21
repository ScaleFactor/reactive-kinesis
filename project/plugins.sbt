addSbtPlugin("com.lucidchart"    % "sbt-scalafmt" % "1.15")
addSbtPlugin("com.typesafe.sbt"  % "sbt-git"      % "0.9.3")
addSbtPlugin("de.heikoseeberger" % "sbt-header"   % "5.0.0")

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.5.1" exclude("org.eclipse.jgit", "org.eclipse.jgit"))
addSbtPlugin("org.scoverage" % "sbt-coveralls" % "1.2.2" exclude("org.eclipse.jgit", "org.eclipse.jgit"))

addSbtPlugin("com.frugalmechanic" % "fm-sbt-s3-resolver" % "0.16.0")

libraryDependencies += "org.slf4j" % "slf4j-nop" % "1.7.25" // Needed by sbt-git
