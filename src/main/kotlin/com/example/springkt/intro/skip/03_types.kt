package com.example.springkt.intro.skip

fun main() {
  // TODO: integer type (Byte, Short, Int, Long)
  val one = 1 // Int
  val threeBillion = 3000000000 // Long
  val fourBillion: Long = 4_000_000_000 // Separator for readability
  // val fiveBillion: Int = 5_000_000_000 // Error out of range
  val two = 2L // Long
  val oneByte: Byte = 1

  // TODO: floating point type (Double, Float)
  val pi = 3.14 // Double
  val e = 2.71f // Float


  // TODO: character type (Char)
  val char: Char = 'a'
  // val errorChar = 'aa'
  val newLine: Char = '\n'
  val unicodeChar = '\uFF00'

  // TODO: string type (String)
  val firstName: String = "Linus"
  val lastName = "Torvald"

  // TODO: string interpolation
  val fullName = "$firstName $lastName"

  // TODO: multiline String
  val jsonString = """
    {
       "code": "SUCCESS",
       "data": {
          "firstName": "Linus",
          "lastName": "Torvald"
       }
    }
  """.trimIndent()

  // TODO: is operator untuk type checking
  val obj: Any = "string"
  if (obj is String) {
    println("obj is string")
  }

  // TODO: atau !is
  if (obj !is Int) {
    println("obj is not Int")
  }

  // TODO: as operator untuk casting
  println("length: ${(obj as String).length}")


  // TODO: smart casting
  val collection: Any = listOf(1,2,3)
  //  println(collection.size) // error

  if (collection is List<*>) {
    println("size: ${collection.size}")
  }
}