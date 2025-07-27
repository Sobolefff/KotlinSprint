package org.example.lesson_5

const val KM_PER_100KM = 100.0

fun main() {

    println("Калькулятор топлива")
    print("Введи расстояние поездки(км): ")
    val distance = readln().toDouble()
    print("Введи расход топлива(л/100км): ")
    val fuel = readln().toDouble()
    print("Введи стоимость топлива(руб/л): ")
    val price = readln().toDouble()

    val needFuel = distance / KM_PER_100KM * fuel
    val sum = needFuel * price

    println("""
            Вам необходимо $needFuel литров топлива.
            Стоимость требуемого топлива составит ${"%.2f".format(sum)} руб.
            """.trimIndent())

}