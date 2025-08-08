package org.example.lesson_13

class UserContact(
    private val name: String,
    private val phone: Long,
    private val companyName: String? = null,
)

fun main() {
    print("Введите номер телефона: ")
    val input = readln()

    try {
        val phone = input.toLong()
        println("Вы ввели корректный номер: $phone")
    } catch (e: Exception) {
        println("Ошибка: ${e::class.simpleName}")
    }
}