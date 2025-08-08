package org.example.lesson_13

class PhonesBook (
    val name: String,
    val phone: Long,
    val companyName: String? = null,
) {
    fun printInfo() {
        println("- Имя: $name\n- Номер: $phone\n- Компания: ${companyName ?: "Не указано"}")
    }
}

fun main() {
    val phonesBook = PhonesBook("Ivan", 1234567890, null)
    phonesBook.printInfo()
}