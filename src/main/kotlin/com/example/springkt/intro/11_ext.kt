package com.example.springkt.intro

// TODO extension function
fun String.isPalindrom() = this == reversed()

// TODO extension property
val String.middle get() = this[length/2]

fun main() {
  val str = "malam"
  println(str.isPalindrom())
  println(str.middle)
}