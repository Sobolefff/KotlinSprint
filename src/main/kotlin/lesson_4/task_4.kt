package org.example.lesson_4

fun main() {

    val trainingDay = 5

    val firstTrainingDay = trainingDay % 2 != 0

    println("""
        Упражнения для рук:     $firstTrainingDay
        Упражнения для ног:     ${!firstTrainingDay}
        Упражнения для спины:   ${!firstTrainingDay}
        Упражнения для пресса:  $firstTrainingDay
    """.trimIndent())



}