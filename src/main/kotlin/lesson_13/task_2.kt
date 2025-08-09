package org.example.lesson_13

class Contact2(
    val name: String,
    val phone: Long,
    val companyName: String? = null,
) {
    fun printInfo() {
        println("- Имя: $name\n- Номер: $phone\n- Компания: ${companyName ?: "Не указано"}")
    }
}

fun main() {
    val phonesBook = Contact2("Ivan", 1234567890, null)
    phonesBook.printInfo()
}