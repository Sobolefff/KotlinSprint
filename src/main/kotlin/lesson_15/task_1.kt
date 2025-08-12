package org.example.lesson_15

class Crucian(
    val name: String,
) : Swimming {
    override fun swim() {
        println("$name плавает")
    }
}

class Seagull(
    val name: String,
) : Flight {
    override fun flying() {
        println("$name летит")
    }
}

class Duck(
    val name: String,
) : Flight, Swimming {
    override fun flying() {
        println("$name летит")
    }

    override fun swim() {
        println("$name плавает")
    }
}

interface Flight {
    fun flying()
}

interface Swimming {
    fun swim()
}


fun main() {

    val seagull = Seagull("Чайка")
    val crucian = Crucian("Карась")
    val duck = Duck("Утка")

    seagull.flying()
    crucian.swim()
    duck.flying()
    duck.swim()

}