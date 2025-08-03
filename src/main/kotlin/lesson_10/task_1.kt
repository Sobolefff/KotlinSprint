package org.example.lesson_10

fun main() {

    val playerNumber = getRandomNumber()
    val computerNumber = getRandomNumber()
    println("Человеку выпало число $playerNumber")
    println("Компьютеру выпало число $computerNumber")

    val result = when {
        playerNumber > computerNumber -> "Победило человечество"
        playerNumber < computerNumber -> "SkyNet победил"
        else -> "Победила дружба"
    }

    println(result)

}

fun getRandomNumber(): Int = (1..6).random()