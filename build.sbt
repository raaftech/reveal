scalaVersion := "3.3.1"
name := "reveal"
organization := "org.rubin55"
version := "0.0.1"

enablePlugins(ScalaNativePlugin)
scalaVersion := "3.3.1"

logLevel := Level.Info

import scala.scalanative.build._

nativeConfig ~= { c =>
  c.withLTO(LTO.none) // thin
    .withMode(Mode.debug) // releaseFast
    .withGC(GC.immix) // commix
}
