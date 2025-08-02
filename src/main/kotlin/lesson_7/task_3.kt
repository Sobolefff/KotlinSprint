package org.example.lesson_7

fun main() {

    print("Введите число: ")
    val inputNumber = readln().toInt()
    println("Четные числа от 0 до $inputNumber:" +
            " ${(0..inputNumber step 2).joinToString(", ")}")

}