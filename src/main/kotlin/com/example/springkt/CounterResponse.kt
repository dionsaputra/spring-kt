package com.example.springkt

import java.text.SimpleDateFormat
import java.util.*

data class CounterResponse(val value: Int = 0, val updatedAt: String) {
  constructor(counter: Counter) : this(counter.value, counter.updatedAt.format())
}

fun Date.format() = SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(this)

val Counter.response get() = CounterResponse(this)
