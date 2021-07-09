package com.example.springkt.intro

// TODO data class
data class Book(private val title: String, private val author: String)

data class HeavyClass(
  private val props1: String = "",
  private val props2: String = "",
  private val props3: String = "",
  private val props4: String = "",
  private val props5: String = ""
)

// TODO sealed class
sealed class Response

class Success(val data: String) : Response()
class Error(val throwable: Throwable) : Response()

fun main() {
  val book = Book("Clean Code", "Uncle Bob")
  println("book: $book")

  val heavy = HeavyClass(
    props5 = "props5",
    props1 = "props1"
  )
  println("heavy: $heavy")

  val response1: Response = Success("data")
  val response2: Response = Error(Exception("unknown error"))

  when (response1) {
    is Success -> println(response1.data)
    is Error -> println(response1.throwable.message)
  }

  when (response2) {
    is Success -> println(response2.data)
    is Error -> println(response2.throwable.message)
  }
}
