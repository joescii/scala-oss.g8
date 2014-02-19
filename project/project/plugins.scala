import sbt._
object PluginDef extends Build {
  lazy val root = Project("plugins", file(".")) dependsOn( g8plugin )
  lazy val g8plugin =
    ProjectRef(uri("file:///C:/Users/jbarnes/code/giter8"), "giter8-plugin")
}
