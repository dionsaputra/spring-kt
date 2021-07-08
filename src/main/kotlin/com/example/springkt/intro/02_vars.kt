package com.example.springkt.intro

import kotlin.random.Random

fun concatName(firstName: String, lastName: String): String {
  // TODO: asumsikan concatName ini komputasi yang mahal
  Thread.sleep(3_000)

  return "$firstName $lastName"
}

fun main() {
  // TODO: keyword val digunakan untuk immutable variable
  val firstName: String = "Linus"

  // TODO: keyword var digunakan untuk mutable variable
  var lastName: String = "Jobs"
  lastName = "Gate" // TODO: bisa di-assign lagi

  // TODO: assignment bisa di-defer, make sure variable pasti diassign
  if (Random.nextBoolean()) {
    lastName = "Torvald"
  } else {
    lastName = "Zuckenberg"
  }

  // TODO: variable lazy tidak akan diassign jika tidak digunakan
  val lazyFullName: String by lazy { concatName(firstName, lastName) }

  val printLazyFullName: Boolean = true
  if (printLazyFullName) {
    println(lazyFullName)
  } else {
    println("Not printing full name")
  }

  // TODO: lateinit var => defer assignment dan bisa diganti lebih dari satu kali
  lateinit var nickName: String
  if (Random.nextBoolean()) {
    nickName = firstName
  }

  if (Random.nextBoolean()) {
    nickName = lastName
  }
}