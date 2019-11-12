package com.seki.kotlinspringboot.data

// TODO domain層のobject
enum class Message(
    private val code: String,
    private val message: String
) {
    MESSAGE_1("1", "hogehoge"),
    MESSAGE_2("2", "fugafuga"),
    OTHER("OTHER", "該当なし");

    companion object {
        fun of(code: String): Message {
            return values().find { it.code == code } ?: OTHER
        }
    }

    fun code() = code
    fun message() = message
}
