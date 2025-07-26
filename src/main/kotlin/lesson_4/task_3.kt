package org.example.lesson_4

fun main() {

    val sunnyToday = true
    val tentIsOpenToday = true
    val humidityToday = 20
    val currentSeason = "Зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${isFavorableForLegumes(sunnyToday, tentIsOpenToday, humidityToday, currentSeason)}")

}

fun isFavorableForLegumes(sunny: Boolean, tent: Boolean, humidity: Int, season: String) = sunny && tent && humidity == 20 && season == "Зима"