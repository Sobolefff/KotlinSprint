package org.example.lesson_14

open class Liner1 (
    val name: String,
    val speed: Int = 10,
    val cargoCapacity: Int = 100,
    val passengersCapacity: Int = 300,
    val iceBreaker: Boolean = false,
) {

    fun printInfo() {
        println("""
            Name: $name
            Speed: $speed
            Cargo capacity: $cargoCapacity
            Passengers capacity: $passengersCapacity
            Ice breaker: $iceBreaker
            """.trimIndent())
        println()
    }

    open fun loadingMethod() {
        println("$name выдвигает горизонтальный трап со шкафута")
    }

}

class IceBreaker1 (
    name: String,
) : Liner1(name, speed = 7, cargoCapacity = 70, passengersCapacity = 100, iceBreaker = true) {
    override fun loadingMethod() {
        println("$name активирует погрузочный кран")
    }
}

class CargoShip1 (
    name: String,
) : Liner1(name, speed = 8, cargoCapacity = 1000, passengersCapacity = 200, iceBreaker = false) {
    override fun loadingMethod() {
        println("$name открывает ворота со стороны кормы")
    }
}

fun main() {
    val liner = Liner1("Liner")
    liner.loadingMethod()
    liner.printInfo()
    val iceBreaker = IceBreaker1("IceBreaker")
    iceBreaker.loadingMethod()
    iceBreaker.printInfo()
    val cargoShip = CargoShip1("CargoShip")
    cargoShip.loadingMethod()
    cargoShip.printInfo()
}