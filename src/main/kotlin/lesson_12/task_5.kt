package org.example.lesson_12

const val CELSIUS_ZERO_KELVIN = 273

class WeatherInKelvin(dayKelvinTemp: Int, nightKelvinTemp: Int, isRainy: Boolean) {

    val dayTemperature: Int
    val nightTemperature: Int
    val isRainy: Boolean

    init {

        dayTemperature = dayKelvinTemp - CELSIUS_ZERO_KELVIN
        nightTemperature = nightKelvinTemp - CELSIUS_ZERO_KELVIN
        this.isRainy = isRainy

        println("Днём: $dayTemperature°C, ночью: $nightTemperature°C, осадки: ${if (isRainy) "да" else "нет"}")
    }

}

fun main() {

    val dayList: MutableList<WeatherInKelvin> = mutableListOf()

    for (i in 1..30) {
        dayList.add(WeatherInKelvin(
            dayKelvinTemp = (273..320).random(),
            nightKelvinTemp = (260..300).random(),
            isRainy = (0..1).random() == 1),
        )
    }

    val daysTemperatures = dayList.map { it.dayTemperature }
    val nightsTemperatures = dayList.map { it.nightTemperature }
    val averageDayTemperature = daysTemperatures.average()
    val averageNightTemperature = nightsTemperatures.average()
    val rainyDaysCount = dayList.count { it.isRainy }

    println("\nСредняя температура дня: ${"%.2f".format(averageDayTemperature)}°C, " +
            "средняя температура ночи: ${"%.2f".format(averageNightTemperature)}°C, " +
            "количество дней с осадками: $rainyDaysCount")

}