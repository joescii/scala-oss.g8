# $name$

## Problem Statement

This little project aims to solve the following problems:

1. Make stuff more awesome.
2. Remove the less awesome stuff from your project.

## Configuration

Add the Sonatype.org Releases repo as a resolver in your `build.sbt` or `Build.scala` as appropriate.

```scala
resolvers += "Sonatype.org Releases" at "https://oss.sonatype.org/content/repositories/releases/"
```

Add **$name$** as a dependency in your `build.sbt` or `Build.scala` as appropriate.

```scala
libraryDependencies ++= Seq(
  // Other dependencies ...
  "$organization;format="lower"$" %% "$name;format="word"$" % "0.0.1" % "compile"
)
```

## Scala Versions

This project is compiled, tested, and published for the following Scala versions:

1. 2.9.1
2. 2.9.1-1
3. 2.9.2
4. 2.9.3
5. 2.10.3


## Usage

To use **$name$**, you should import it and call it...

## Examples

```scala
package org.example

import $package$._

case object MyObject {
  // ...
}
```

## Wishlist

Below is a list of features we would like to one day include in this project

1. Support more awesome.
2. Decimate the not-awesome.
