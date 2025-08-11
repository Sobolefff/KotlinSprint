package org.example.lesson_15

class Fish(
    val name: String,
) : Swimming {
    override fun swim() {
        println("$name плавает")
    }
}

class Bird(
    val name: String,
) : Flight {
    override fun flying() {
        println("$name летит")
    }
}

interface Flight {
    fun flying()
}

interface Swimming {
    fun swim()
}


fun main() {

    val seagull = Bird("Чайка")
    val crucian = Fish("Карась")
    val duck = Bird("Утка")

    seagull.flying()
    crucian.swim()
    duck.flying()

}