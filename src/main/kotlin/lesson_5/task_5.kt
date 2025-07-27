package org.example.lesson_5

fun main() {

    val prizeNumbers = List(3) {(Math.random() * 43).toInt()}.toSet()

    println("Сыграйте в лотерею! Нужно угадать три числа от 0 до 42. Попробуйте!")
    print("Введите первое число: ")
    val userNumber1 = readln().toInt()
    print("Введите второе число: ")
    val userNumber2 = readln().toInt()
    print("Введите третье число: ")
    val userNumber3 = readln().toInt()

    val guessedNumbers = setOf(userNumber1, userNumber2, userNumber3).intersect(prizeNumbers)

    val result = when (guessedNumbers.size) {
        3 -> "Поздравляем! Вы выиграли джекпот!"
        2 -> "Поздравляем! Вы выиграли крупный приз!"
        1 -> "Вы выиграли утешительный приз!"
        else -> "Неудача! Вы не угадали ни одного числа."
    }

    println(result + "\nПравильные числа: ${prizeNumbers.joinToString(", ")}")

}