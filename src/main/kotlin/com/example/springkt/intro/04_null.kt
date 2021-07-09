package com.example.springkt.intro

import kotlin.random.Random

fun main() {
  // TODO: non-null String, cannot be null
  var firstName: String = "Linus"
  //  firstName = null

  // TODO: nullable String, maybe null, maybe not null
  var lastName: String?
  if (Random.nextBoolean()) {
    lastName = "Torvald"
  } else {
    lastName = null
  }

  // TODO: null checking
  val lastNameLength = lastName?.length
  println("lastNameLength: $lastNameLength")

  // TODO: elvis operator
  val fullName = "$firstName ${lastName ?: firstName}"
  println("fullName: $fullName")

  // TODO: default if null using elvis
  val nameLength = firstName.length + (lastName?.length ?: 0)
  println("nameLength: $nameLength")
}