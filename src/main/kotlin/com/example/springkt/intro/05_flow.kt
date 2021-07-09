package com.example.springkt.intro

import kotlin.random.Random

fun main() {
  // TODO: if
  if (Random.nextBoolean()) {
    println("yay!")
  } else {
    println(":(")
  }

  // TODO: one liner?
  if (Random.nextBoolean()) println("yay! one liner")
  else println(":( one liner")

  // TODO: when
  val luckyNumber = Random.nextInt(until = 10)
  when (luckyNumber) {
    1 -> println("Not lucky")
    2 -> println("Still not lucky")
    3 -> println("Yay!")
    else -> println("To Big")
  }

  // TODO: still when
  when {
    luckyNumber == 3 -> println("Yay!")
    luckyNumber % 2 == 0 -> println("Even :(")
    luckyNumber > 3 -> println("To Big")
    else -> println("Location unknown")
  }

  // TODO: for loop
  for (i in 0 until 4) {
    println("Downloading $i/3")
  }

  // TODO: while loop
  var x = Random.nextInt(until = 100)
  while (x % 2 == 0 && x > 0) {
    println("x: $x")
    x /= 2
  }
  println("result: $x")

  // TODO: try
  try {
    if (Random.nextBoolean()) println("yay!")
    else throw Exception("not lucky exception")
  } catch (e: Exception) {
    println(e.message)
  }

  // TODO: if, when, try is expression
  val yourNumber = if (Random.nextBoolean()) 12 else 13
  val myNumber = when {
    Random.nextInt(10) % 3 == 0 -> 1
    Random.nextInt(100) % 30 == 0 -> 2
    Random.nextBoolean() -> 3
    else -> 4
  }
  val ourNumber = try {
    callApi()
  } catch (e: Exception) {
    51
  }
}

fun callApi() = if (Random.nextBoolean()) 15 else throw Exception("no network")
