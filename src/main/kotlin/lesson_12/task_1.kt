package org.example.lesson_12

class Weather() {
    var dayTemperature: Int = 25
    var nightTemperature: Int = 15
    var isRainy: Boolean = false

    fun printInfo() {
        println("Днём: $dayTemperature°C, ночью: $nightTemperature°C, осадки: ${if (isRainy) "да" else "нет"}")
    }
}

fun main() {

    val weather1 = Weather()
    val weather2 = Weather()
    weather1.dayTemperature = 40
    weather1.nightTemperature = 30
    weather1.isRainy = true

    weather2.dayTemperature = 35
    weather2.nightTemperature = 25
    weather2.isRainy = true

    weather1.printInfo()
    weather2.printInfo()

}