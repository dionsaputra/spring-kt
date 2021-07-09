package com.example.springkt

import org.springframework.stereotype.Service
import java.util.*

interface CounterService {
  fun last(): Counter = Counter()
  fun increment(): Counter = Counter(value = 1)
  fun decrement(): Counter = Counter(value = -1)
  fun reset(): Counter = Counter(value = 0)
}

@Service
class CounterServiceImpl(val resetService: ResetService) : CounterService {

  var counter: Counter = Counter()

  override fun last() = counter

  override fun increment(): Counter {
    counter = counter.copy(value = counter.value + 1, updatedAt = Date())
    return counter
  }

  override fun decrement(): Counter {
    counter = counter.copy(value = counter.value - 1, updatedAt = Date())
    return counter
  }

  override fun reset(): Counter {
    counter = resetService.reset()
    return counter
  }
}
