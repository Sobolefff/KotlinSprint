package org.example.lesson_10

fun main() {

    var playerWinsCounter = 0

    while (true) {

        val playerNumber = getRandomNum()
        val computerNumber = getRandomNum()
        val result = playRound(playerNumber, computerNumber)

        if (result == "Победило человечество") playerWinsCounter++

        println(result)

        println("Хотите сыграть еще раз? (да/нет)")

        if (readln().lowercase() == "да") continue
        else {
            println("Игра закончена. Человек победил $playerWinsCounter раз")
            break
        }

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