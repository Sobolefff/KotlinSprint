package org.example.lesson_6

const val MS_IN_SEC: Long = 1000L

fun main() {

    print("Включим таймер. Введите время в секундах:")
    val timerTime = readln().toLong()
    println("Таймер включен. Осталось $timerTime секунд.")
    Thread.sleep(timerTime * MS_IN_SEC)
    println("Время вышло!")

}