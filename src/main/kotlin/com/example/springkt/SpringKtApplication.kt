package com.example.springkt

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.text.SimpleDateFormat
import java.util.*

@SpringBootApplication
class SpringKtApplication

fun main(args: Array<String>) {
  runApplication<SpringKtApplication>(*args)
}

data class Counting(var value: Int = 0, var updatedAt: Date = Date())

data class CountingResponse(val value: Int, val updatedAt: String)

val Counting.response get() = CountingResponse(this.value, this.updatedAt.format())

data class BaseResponse<out T>(val code: String, val data: T)

fun <T> T.toSuccess() = BaseResponse("SUCCESS", this)

fun Date.format() = SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(this)

@RestController
@RequestMapping("/counter")
class CounterController(val counterService: CounterService) {

  @GetMapping
  fun getCurrent() = counterService.current().response.toSuccess()

  @PutMapping("/reset")
  fun reset() = counterService.reset().response.toSuccess()

  @PutMapping("/up")
  fun up() = counterService.up().response.toSuccess()

  @PutMapping("/down")
  fun down() = counterService.down().response.toSuccess()
}

interface CounterService {
  fun current(): Counting
  fun reset(): Counting
  fun up(): Counting
  fun down(): Counting
}

@Service
class CountServiceImpl : CounterService {

  var counting = Counting()

  override fun current() = counting

  override fun reset() = with(counting) {
    value = 0
    updatedAt = Date()
    this
  }

  override fun up() = with(counting) {
    value += 1
    updatedAt = Date()
    this
  }

  override fun down() = with(counting) {
    value -= 1
    updatedAt = Date()
    this
  }
}