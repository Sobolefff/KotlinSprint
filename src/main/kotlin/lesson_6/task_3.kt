package org.example.lesson_6

fun main() {

    print("Включим таймер. Введите время в секундах:")
    var timerTime = readln().toLong()
    println("Таймер включен.")

    while (timerTime > 0) {

        println("Осталось ${timerTime--} секунд.")
        Thread.sleep(MS_IN_SEC)
    }

    println("Время вышло!")

}