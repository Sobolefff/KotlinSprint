package org.example.lesson_2

fun main() {

    val miningBuff = 20
    val extractedCrystalOre = 7
    val extractedIronOre = 11

    println("""
        Additional crystalline ore was mined(with buff): ${(extractedCrystalOre * miningBuff / 100)}
        Additional iron ore was mined(with buff): ${(extractedIronOre * miningBuff / 100)}
    """.trimIndent())

}