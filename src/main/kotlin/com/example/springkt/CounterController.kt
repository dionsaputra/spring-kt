package com.example.springkt

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class CounterController(val counterService: CounterService) {

  @GetMapping("/")
  fun last() = counterService.last().response.toSuccess()

  @PutMapping("/up")
  fun increment() = counterService.increment().response.toSuccess()

  @PutMapping("/down")
  fun decrement() = counterService.decrement().response.toSuccess()

  @PutMapping("/reset")
  fun reset() = counterService.reset().response.toSuccess()
}
