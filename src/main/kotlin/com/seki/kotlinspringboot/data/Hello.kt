package com.seki.kotlinspringboot.data

import java.util.Date

data class Hello (
    val message: String = "Hello. World.",
    val date: Date = Date()
)
