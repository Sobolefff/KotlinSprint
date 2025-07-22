package org.example.lesson_2

import kotlin.math.pow

fun main() {

    val deposit = 70_000
    val percentOfYear = 16.7
    val yearsOfDeposit = 20

    println("Через 20 лет вы получите: ${"%.3f".format(getSumOfDeposit(deposit, percentOfYear, yearsOfDeposit))}")

}

fun getSumOfDeposit(deposit: Int, percentOfYear: Double, yearsOfDeposit: Int): Double {
    return deposit * (1 + percentOfYear / 100).pow(yearsOfDeposit.toDouble())
}