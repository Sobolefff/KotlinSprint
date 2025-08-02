package org.example.lesson_10

fun main() {

    print("Введите длину пароля: ")
    val passwordLength = readln().toInt()
    println("Сгенерированный пароль: ${getPassword(passwordLength)}")

}

fun getPassword(length: Int): String {

    val digits = ('0'..'9').toList()
    val symbols = listOf('!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ' ').toList()
    val allChars = digits + symbols
    val stringBuild = StringBuilder()

    stringBuild.append(digits.random())
    stringBuild.append(symbols.random())

    repeat(length - 2) { stringBuild.append(allChars.random()) }

    return stringBuild.toList().shuffled().joinToString("")

}