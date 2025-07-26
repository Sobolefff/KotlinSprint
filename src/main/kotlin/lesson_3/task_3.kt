package org.example.lesson_3

fun main() {

    val number = 6

        println(
            (1..10).joinToString("\n") {"$number * $it = ${number * it}" }
        )

}