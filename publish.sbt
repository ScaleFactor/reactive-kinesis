publishTo := {
  val defaultDestination = publishTo.value
  if (isSnapshot.value) {
    Some(Resolver.url("Scalefactor Snapshots", url("s3://s3-us-west-2.amazonaws.com/scalefactor-libraries/snapshots/reactive-kinesis"))(Resolver.ivyStylePatterns))
  } else {
    Some(Resolver.url("Scalefactor Releases", url("s3://s3-us-west-2.amazonaws.com/scalefactor-libraries/releases/reactive-kinesis"))(Resolver.ivyStylePatterns))
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
publishMavenStyle := false 
