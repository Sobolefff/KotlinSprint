package org.example.lesson_2

const val MINING_BUFF = 0.2

fun main() {

    val extractedCrystalOre = 7
    val extractedIronOre = 11

    println("""
        Additional crystalline ore was mined(with buff): ${(extractedCrystalOre * MINING_BUFF).toInt()}
        Additional iron ore was mined(with buff): ${(extractedIronOre * MINING_BUFF).toInt()}
    """.trimIndent())

}