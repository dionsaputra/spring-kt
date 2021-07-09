package com.example.springkt.intro

// TODO: open class
open class Person(val name: String)

class Student(name: String, val schoolName: String) : Person(name)

// TODO: override
open class Animal {

  open var type: String? = null

  open fun moveBy(): String = "walking"

}

// TODO: override property
class Cat : Animal() {
  override var type: String? = "cat"
}

// TODO: override method
class Bird : Animal() {
  override fun moveBy(): String {
    return "flying"
  }
}

fun main() {
  val person = Person("Linus")
  println("person: ${person.name}")

  val student = Student("Mark", "Harvard")
  println("student: ${student.name}, ${student.schoolName}")

  val cat: Animal =
    Cat()
  println("cat: ${cat.type}, ${cat.moveBy()}")

  val bird: Animal =
    Bird()
  println("bird: ${bird.type}, ${bird.moveBy()}")
}
