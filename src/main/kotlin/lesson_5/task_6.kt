package org.example.lesson_5

import kotlin.math.pow

const val CENTIMETERS_IN_METER = 100

fun main() {

    println("Рассчитаем ваш ИМТ")
    print("Введите ваш вес(кг): ")
    val weight = readln().toDouble()
    print("Введите ваш рост(см): ")
    val height = readln().toDouble()

    val imt = weight / (height / CENTIMETERS_IN_METER ).pow(2)

    val result = when (true) {
        (imt < 18.5) -> "Недостаточная масса тела"
        (18.5 <= imt && imt < 25) -> "Нормальная масса тела"
        (25 <= imt && imt < 30) -> "Избыточная масса тела"
        else -> "Ожирение"
    }

    println("Ваш ИМТ: ${"%.2f".format(imt)}, $result")

}