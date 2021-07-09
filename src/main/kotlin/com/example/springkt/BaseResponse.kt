package com.example.springkt

data class BaseResponse<T>(val code: String, val data: T)

fun <T> T.toSuccess() = BaseResponse("SUCCESS", this)