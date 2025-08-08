package org.example.lesson_13

class ContactBook (
    private val name: String,
    private val phone: Long,
    val companyName: String? = null,
) {
    fun printInfo() {
        println("- Имя: $name\n- Номер: $phone\n- Компания: ${companyName ?: "Не указано"}")
    }
}

fun main() {
    val phonesBook = listOf(
        ContactBook("Ivan", 1234567890, "Google"),
        ContactBook("Petr", 9876543210),
        ContactBook("Sidor", 1111111111),
        ContactBook("Vasya", 2222222222, "Mail.ru"),
        ContactBook("Kolya", 3333333333, "null")
    )
    val companies = phonesBook.mapNotNull { it.companyName }
        .distinct()
        .filter { it != "null" }
    println("Компании в телефонной книге:\n${companies.joinToString("\n")}")
}