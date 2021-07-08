package com.example.springkt.intro

// TODO: fun in kotlin
fun fibo(x: Int): Int {
  return if (x < 2) 1
  else fibo(x - 1) + fibo(x - 2)
}

fun fibo1(x: Int): Int = if (x < 2) 1 else fibo1(x - 1) + fibo1(x - 2)

fun isEven(x: Int) = x % 2 == 0

// TODO: fun overload
fun fullName(firstName: String, lastName: String = "") = "$firstName $lastName"

// TODO: fun as parameter
fun mapString(str: String, mapper: (String) -> String) = mapper(str)

fun upperCaseMapper(str: String) = str.toUpperCase()
fun lowerCaseMapper(str: String) = str.toLowerCase()

// TODO: fun as return
fun getMapper(upper: Boolean) = if (upper) ::upperCaseMapper else ::lowerCaseMapper

// TODO: inline fun
inline fun repeat(times: Int, action: (Int) -> Unit) {
  for (i in 0 until times) {
    action.invoke(i)
  }
}

fun main() {
  val fullName = fullName("Linus", "Torvald")
  val nickName = fullName("Linus")

  val upperCase = mapString(fullName, ::upperCaseMapper)
  println(upperCase)

  val lowerCase = mapString(fullName, ::lowerCaseMapper)
  println(lowerCase)

  val lowerCaseMapper = getMapper(false)
  val lowerCaseNickName = mapString(nickName, lowerCaseMapper)

  // TODO: lambda
  val upperCaseNickName = mapString(nickName) { it.toUpperCase() }

  // TODO: more lambda in kotlin stdlib
  val list = listOf(1, 2, 3).filter { it % 2 == 0 }

  // TODO: inline function make lambda cheap
  repeat(10) { println(list) }
}