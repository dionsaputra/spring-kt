package com.example.springkt.intro.skip

interface Calculator {
  fun plus(x: Int, y: Int): Int
  fun minus(x: Int, y: Int) = x - y
}

class SimpleCalculator : Calculator {
  override fun plus(x: Int, y: Int): Int {
    return x + y
  }
}

fun main() {
  val calculator = SimpleCalculator()
  println(calculator.plus(1, 2))
  println(calculator.minus(1, 3))
}