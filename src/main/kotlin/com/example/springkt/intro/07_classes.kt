package com.example.springkt.intro

class Simple

class PrimaryConstructor constructor(val field: String)

class AlsoPrimaryConstructor(val field: String)

class Initializer {
  val field: String

  init {
    println("called initializer")
    field = "x"
  }
}

class SecondaryConstructor {

  val field: String

  constructor(other: PrimaryConstructor) {
    println("called secondary constructor 1")
    field = other.field
  }
}

class PrimaryAndSecondaryConstructor(val field1: String) {

  var field2: String = "default"

  constructor(other: AlsoPrimaryConstructor) : this("default") {
    println("called secondary constructor 2")
    field2 = other.field
  }
}

fun main() {
  val simple = Simple()
  println("simple $simple")

  val primaryConstructor = PrimaryConstructor("field")
  println("primary constructor ${primaryConstructor.field}")

  val alsoPrimaryConstructor = AlsoPrimaryConstructor("field")
  println("also primary constructor ${alsoPrimaryConstructor.field}")

  val initializer = Initializer()
  println("initializer ${initializer.field}")

  val secondaryConstructor = SecondaryConstructor(primaryConstructor)
  println("secondaryConstructor ${secondaryConstructor.field}")

  val primaryAndSecondaryConstructor = PrimaryAndSecondaryConstructor("field1")
  println("primaryAndSecondaryConstructor ${primaryAndSecondaryConstructor.field1} ${primaryAndSecondaryConstructor.field2}")

  val otherPrimaryAndSecondaryConstructor = PrimaryAndSecondaryConstructor(alsoPrimaryConstructor)
  println("otherPrimaryAndSecondaryConstructor ${otherPrimaryAndSecondaryConstructor.field1} ${otherPrimaryAndSecondaryConstructor.field2}")
}