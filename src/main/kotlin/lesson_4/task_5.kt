package org.example.lesson_4

const val DAMAGE = false
const val MIN_CREW = 55
const val MAX_CREW = 70
const val MIN_FOOD_BOXES_VALUE = 50
const val WEATHER_GOOD = true


fun main() {

    print("Корабль поврежден?(true/false): ")
    val currentDamage = readln().toBoolean()

    print("Введите число экипажа на корабле: ")
    val currentCrew = readln().toInt()

    print("Введите количество ящиков провизии на борту: ")
    val currentFoodBoxesValue = readln().toInt()

    print("Погода хорошая?(true/false): ")
    val currentWeather = readln().toBoolean()

    println(
        "Корабль допущен к долгосрочному плаванию: ${
            (currentDamage == DAMAGE && currentCrew in MIN_CREW..MAX_CREW && currentFoodBoxesValue > MIN_FOOD_BOXES_VALUE)
                    || (currentCrew == 70 && currentWeather == WEATHER_GOOD && currentFoodBoxesValue >= MIN_FOOD_BOXES_VALUE)
        }"
    )


}

