publishTo := {
  val defaultDestination = publishTo.value
  if (isSnapshot.value) {
    Some(Resolver.url("Scalefactor Snapshots", url("s3://s3-us-west-2.amazonaws.com/scalefactor-libraries/reactive-kinesis/snapshots"))(Resolver.ivyStylePatterns))
  } else {
    Some(Resolver.url("Scalefactor Releases", url("s3://s3-us-west-2.amazonaws.com/scalefactor-libraries/reactive-kinesis/releases"))(Resolver.ivyStylePatterns))
  }
}

credentials ++= List(Path.userHome / ".aws/credentials")
  .filter(_.exists)
  .map(Credentials(_)) //For snapshots

organization := "com.weightwatchers"
pomIncludeRepository := { _ =>
  false
} //remove optional dependencies from our pom

licenses += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html"))
scmInfo := Some(
  ScmInfo(url("https://github.com/WW-Digital/reactive-kinesis"),
          "scm:git@github.com:WW-Digital/reactive-kinesis.git")
)
publishMavenStyle := false 
