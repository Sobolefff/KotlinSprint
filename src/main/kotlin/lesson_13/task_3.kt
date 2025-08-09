package org.example.lesson_13

class Contact3(
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
        Contact3("Ivan", 1234567890, "Google"),
        Contact3("Petr", 9876543210),
        Contact3("Sidor", 1111111111),
        Contact3("Vasya", 2222222222, "Mail.ru"),
        Contact3("Kolya", 3333333333, "null")
    )
    val companies = phonesBook.mapNotNull { it.companyName }
        .distinct()
    println("Компании в телефонной книге:\n${companies.joinToString("\n")}")
}