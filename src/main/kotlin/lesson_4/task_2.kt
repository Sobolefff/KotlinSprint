package org.example.lesson_4

fun main() {

    val minWeight = 35
    val maxWeight = 100
    val maxVolume = 100

    val firstCargoWeight = 20
    val firstCargoVolume = 80

    val secondCargoWeight = 50
    val secondCargoVolume = 100

    println(
        "Груз с весом $firstCargoWeight кг и объемом $firstCargoVolume л соответствует категории 'Average': ${firstCargoWeight > minWeight && firstCargoWeight <= maxWeight && firstCargoVolume < maxVolume}\n" +
                "Груз с весом $secondCargoWeight кг и объемом $secondCargoVolume л соответствует категории 'Average': ${secondCargoWeight > minWeight && secondCargoWeight <= maxWeight && secondCargoVolume < maxVolume}"
    )

}