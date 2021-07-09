package com.example.springkt.intro

class Glass() {

  var volume: Int = 0
    // TODO: custom setter
    set(value) {
      version += 1
      field = value
    }

  private var version: Int = 1

  private val percentage: Int
    // TODO: custom getter
    get() = volume * 100 / 20

  override fun toString(): String {
    return "$volume($percentage%), v$version"
  }
}

fun main() {
  val glass = Glass()
  println(glass)

  glass.volume = 1
  println(glass)

  Thread.sleep(1000)

  glass.volume = 10
  println(glass)
}