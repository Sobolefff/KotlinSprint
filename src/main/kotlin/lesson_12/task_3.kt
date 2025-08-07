package org.example.lesson_12

const val CELSIUS_ZERO = 273

class DayWeatherKelvin(dayKelvinTemp: Int, nightKelvinTemp: Int, val isRainy: Boolean) {

    private val dayTemperature: Int = dayKelvinTemp - CELSIUS_ZERO
    private val nightTemperature: Int = nightKelvinTemp - CELSIUS_ZERO

    fun printInfo() {
        println("Днём: $dayTemperature°C, ночью: $nightTemperature°C, осадки: ${if (isRainy) "да" else "нет"}")
    }
}

fun main() {

    val weather1 = DayWeatherKelvin(
        dayKelvinTemp = 300,
        nightKelvinTemp = 290,
        isRainy = true
    )

    weather1.printInfo()

}