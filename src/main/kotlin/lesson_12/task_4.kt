package org.example.lesson_12

const val CELSIUS_ZERO_K = 273

class DayWeatherInKelvin(dayKelvinTemp: Int, nightKelvinTemp: Int, val isRainy: Boolean) {

    private val dayTemperature: Int = dayKelvinTemp - CELSIUS_ZERO_K
    private val nightTemperature: Int = nightKelvinTemp - CELSIUS_ZERO_K

    init {
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