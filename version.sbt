
import org.typelevel.sbt.ReleaseSeries
import org.typelevel.sbt.Version._

TypelevelKeys.series in ThisBuild := ReleaseSeries(0,4)

TypelevelKeys.relativeVersion in ThisBuild := Relative(0,Snapshot)
