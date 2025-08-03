package org.example.lesson_7

const val MS_IN_SEC: Long = 1000L

fun main() {

    print("Поставим таймер. Введите время в секундах: ")
    val inputSeconds = readln().toLong()
    println("Таймер поставлен")
    for (i in inputSeconds downTo 1) {
        println("Осталось $i секунд")
        Thread.sleep(MS_IN_SEC)
    }
    println("Время вышло!")
}