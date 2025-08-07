package org.example.lesson_12

class DayWeather(
    val dayTemperature: Int,
    val nightTemperature: Int,
    val isRainy: Boolean,
) {
    fun printInfo() {
        println("Днём: $dayTemperature°C, ночью: $nightTemperature°C, осадки: ${if (isRainy) "да" else "нет"}")
    }
}

fun main() {

    val weather1 = DayWeather(
        dayTemperature = 25,
        nightTemperature = 15,
        isRainy = true
    )

    weather1.printInfo()

}