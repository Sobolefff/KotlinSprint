package org.example.lesson_10

fun main() {

    print("Введите длину пароля: ")
    val passwordLength = readln().toInt()
    println("Сгенерированный пароль: ${getPassword(passwordLength)}")

}

fun getPassword(length: Int): String {

    val digits = ('0'..'9')
    val symbols = (' '..'/')

    return (1..length)
        .map {
            if (it % 2 == 0) symbols.random()
            else digits.random()
        }
        .joinToString("")

}
