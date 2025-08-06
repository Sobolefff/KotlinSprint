package org.example.lesson_12

const val CELSIUS_ZERO = 273

class DayWeatherKelvin(dayKelvinTemp: Int, nightKelvinTemp: Int, isRainy: Boolean) {

    val dayTemperature: Int
    val nightTemperature: Int
    val isRainy: Boolean

    init {
        dayTemperature = dayKelvinTemp - CELSIUS_ZERO
        nightTemperature = nightKelvinTemp - CELSIUS_ZERO
        this.isRainy = isRainy
    }

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