package org.example.lesson_3

fun main() {

    val inputMove = "D2-D4;0"
    val (fromMove, toMove, moveNumber) = inputMove.split("-",";")


    println("""
        Откуда: $fromMove
        Куда: $toMove
        Номер хода: $moveNumber
    """.trimIndent())

}