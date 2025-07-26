package org.example.lesson_4

const val SUNNY_FOR_LEGUMES = true
const val TENT_FOR_LEGUMES = true
const val HUMIDITY_FOR_LEGUMES = 20
const val SEASON_FOR_LEGUMES = "Зима"

fun main() {

    val sunnyToday = true
    val tentIsOpenToday = true
    val humidityToday = 20
    val currentSeason = "Зима"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? ${
            isFavorableForLegumes(
                sunnyToday, tentIsOpenToday, humidityToday, currentSeason
            )
        }"
    )

}

fun isFavorableForLegumes(
    sunny: Boolean, tent: Boolean, humidity: Int, season: String
) =
    sunny == SUNNY_FOR_LEGUMES && tent == TENT_FOR_LEGUMES && humidity == HUMIDITY_FOR_LEGUMES && season == SEASON_FOR_LEGUMES