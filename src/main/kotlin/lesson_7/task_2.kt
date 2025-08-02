package org.example.lesson_7

fun main() {

    while (true) {
        val randomNumber = (1000..9999).random()
        println("Ваш код авторизации: $randomNumber")
        print("Введите ваш код авторизации: ")
        val userNumber = readln().toInt()
        if (userNumber == randomNumber) {
            println("Вы успешно вошли в систему")
            return
        } else {
            println("Вы ввели неверный код, повторите попытку")
            continue
        }
    }

}