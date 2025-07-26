package org.example.lesson_5

import java.time.LocalDate

const val AGE_OF_MAJORITY = 18

fun main() {

    print("Введи год своего рождения: ")
    val userAge = LocalDate.now().year - readln().toInt()

    println(
        if (userAge >= AGE_OF_MAJORITY) {
            "Показать экран со скрытым контентом"
        } else if (userAge < 0) {
            "Неверный год"
        } else "Несовершеннолетним вход запрещен"
    )

}