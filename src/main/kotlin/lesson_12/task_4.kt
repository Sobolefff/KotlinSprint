package org.example.lesson_12

const val CELSIUS_ZERO_K = 273

class DayWeatherInKelvin(dayKelvinTemp: Int, nightKelvinTemp: Int, isRainy: Boolean) {

    val dayTemperature: Int
    val nightTemperature: Int
    val isRainy: Boolean

    init {

        dayTemperature = dayKelvinTemp - CELSIUS_ZERO_K
        nightTemperature = nightKelvinTemp - CELSIUS_ZERO_K
        this.isRainy = isRainy

        println("Днём: $dayTemperature°C, ночью: $nightTemperature°C, осадки: ${if (isRainy) "да" else "нет"}")
    }

}

fun main() {

    val weather1 = DayWeatherInKelvin(
        dayKelvinTemp = 300,
        nightKelvinTemp = 290,
        isRainy = true
    )

}