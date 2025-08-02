package org.example.lesson_6

import java.util.*


fun main() {

    val prizeNumber = Random().nextInt(1, 10)
    var tryCount = 1
    var inputNumber: Int? = null
    println("Сыграй в лотерею! Нужно угадать число от 1 до 9. У тебя 5 попыток.")


    while (tryCount in 1..5 && prizeNumber != inputNumber) {


        print("Попытка №${tryCount++}. Введите число: ")
        inputNumber = readln().toInt()
        if (prizeNumber != inputNumber) {
            println("Неверно!")
            continue
        } else {
            println("Поздравляем! Ты угадал!")
            return
        }

    }
    println("Вы исчерпали все попытки! Правильное число: $prizeNumber")

}