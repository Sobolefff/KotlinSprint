package org.example.lesson_3

fun main() {

    val inputMove = "D2-D4;0"
    val partsOfMove = inputMove.split(";")
    val moveNumber = partsOfMove[1].toInt()
    val fromMove = partsOfMove[0].split("-")[0]
    val toMove = partsOfMove[0].split("-")[1]

    println("""
        Откуда: $fromMove
        Куда: $toMove
        Номер хода: $moveNumber
    """.trimIndent())

}