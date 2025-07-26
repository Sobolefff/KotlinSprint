package org.example.lesson_5

fun main() {

    val sum = List(2) { (Math.random() * 11).toInt() }.also {
        print("Проверка на бота: ${it[0]} + ${it[1]} = ")
    }.sum()

    println(if (readln().toInt() == sum) "Добро пожаловать!" else "Доступ запрещен!")

}