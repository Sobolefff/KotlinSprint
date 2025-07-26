package org.example.lesson_5

fun main() {
    // логика через множество мне кажется более удобна под условие задачи, чем куча сравнений

    //закомментировал вариант с рандомом
    //val prizeNumbers = List(2) {(Math.random() * 43).toInt()}.toSet()

    val prizeNumbers = setOf(23, 42)

    println("Сыграй в лотерею! Нужно угадать два числа от 0 до 42. Попробуй!")
    print("Введи первое число: ")
    val userNumber1 = readln().toInt()
    print("Введи второе число: ")
    val userNumber2 = readln().toInt()

    val guessedNumbers = setOf(userNumber1, userNumber2).intersect(prizeNumbers)

    val result = when (guessedNumbers.size) {
        2 -> "Поздравляем! Вы выиграли главный приз!"
        1 -> "Вы выиграли утешительный приз!"
        else -> "Неудача!"
    }

    println(result + "\nПравильные числа: ${prizeNumbers.joinToString(" и ")}")

}