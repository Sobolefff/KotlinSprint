package org.example.lesson_13

class Contact(
    private val name: String,
    private val phone: Long,
    private val companyName: String? = null,
) {
    fun printContacts() {
        println("- Имя: $name\n- Номер: $phone\n- Компания: ${companyName ?: "Не указано"}\n")
    }
}

fun main() {
    val phonesBook: MutableList<Contact> = mutableListOf()
    while (true) {
        println("Добавим контакт в книгу.")
        print("Введите имя: ")
        val name = readln()
        println("Введите номер: ")
        val phone: Long? = readln().toLongOrNull()

        if (phone == null) {
            println("Вы не ввели номер телефона, попробуйте еще раз")
            continue
        } else {
            println("Введите название компании: ")
            val companyName = readln()
            phonesBook.add(Contact(name, phone, companyName))
            println("Контакт успешно добавлен")
        }
        print("Хотите добавить еще один контакт? (y/n):")
        if (readln() != "y") {
            break
        }
    }
    println("Контакты в телефонной книге:")
    phonesBook.forEach { it.printContacts() }
}