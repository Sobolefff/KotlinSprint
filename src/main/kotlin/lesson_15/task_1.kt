package org.example.lesson_15

abstract class Animal : Movable {
    abstract val name: String
}

class Fish(
    override val name: String,
) : Animal() {
    override fun moveMethod() {
        println("$name плавает")
    }
}

class Bird(override val name: String) : Animal() {
    override fun moveMethod() {
        println("$name летит")
    }
}

interface Movable {
    fun moveMethod()
}


fun main() {

    val seagull = Bird("Чайка")
    val crucian = Fish("Карась")
    val duck = Bird("Утка")

    seagull.moveMethod()
    crucian.moveMethod()
    duck.moveMethod()

}