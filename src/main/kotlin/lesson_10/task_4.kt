package org.example.lesson_10

fun main() {

    while (true) {

        val playerNumber = getRandomNum()
        val computerNumber = getRandomNum()

        println(playRound(playerNumber, computerNumber))
        println("Хотите сыграть еще раз? (да/нет)")

        if (readln().lowercase() == "да") continue
        else break

    }

}

fun getRandomNum(): Int {

    return (1..9).random()

}

fun playRound(playerNumber: Int, computerNumber: Int ): String {

    println("Человеку выпало число $playerNumber")
    println("Компьютеру выпало число $computerNumber")

    val result = when {
        playerNumber > computerNumber -> "Победило человечество"
        playerNumber < computerNumber -> "SkyNet победил"
        else -> "Победила дружба"
    }

    return result

}