publishTo := {
  val defaultDestination = publishTo.value
  if (isSnapshot.value) {
    Some("Scalefactor Snapshots" at "s3://s3-us-west-2.amazonaws.com/scalefactor-libraries/snapshots")
  } else {
    Some("Scalefactor Releases" at "s3://s3-us-west-2.amazonaws.com/scalefactor-libraries/releases")
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
publishMavenStyle := true 
