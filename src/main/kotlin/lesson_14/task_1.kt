package org.example.lesson_14

open class Liner (
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
    }
}

class IceBreaker (
    name: String,
) : Liner(name, speed = 7, cargoCapacity = 70, passengersCapacity = 100, iceBreaker = true)

class CargoShip (
    name: String,
) : Liner(name, speed = 8, cargoCapacity = 1000, passengersCapacity = 200, iceBreaker = false)

fun main() {
    val liner = Liner("Liner")
    liner.printInfo()
    val iceBreaker = IceBreaker("IceBreaker")
    iceBreaker.printInfo()
    val cargoShip = CargoShip("CargoShip")
    cargoShip.printInfo()
}