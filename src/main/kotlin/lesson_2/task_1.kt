package org.example.lesson_2

fun main() {

    val listOfGrades = listOf(3, 4, 3, 5)

    println("Average grade is ${"%.2f".format(listOfGrades.average())}")

}