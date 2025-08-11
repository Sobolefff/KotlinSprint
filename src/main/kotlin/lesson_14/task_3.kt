package org.example.lesson_14

import kotlin.math.pow

const val PI = 3.14

abstract class Figure(
    val color: String,
) {
    abstract fun getArea(): Double
    abstract fun getPerimeter(): Double
}

class Circle(
    color: String,
    private val radius: Double,
) : Figure(color) {

    override fun getArea(): Double {
        return PI * radius.pow(2)
    }

    override fun getPerimeter(): Double {
        return 2 * PI * radius
    }

}

class Rectangle(
    color: String,
    private val width: Double,
    private val height: Double,
) : Figure(color) {

    override fun getArea(): Double {
        return width * height
    }

    override fun getPerimeter(): Double {
        return 2 * (width + height)
    }

}

fun main() {

    val allFigures = listOf(
        Circle("черный", 5.0),
        Rectangle("белый", 10.0, 20.0),
        Rectangle("белый", 15.0, 25.0),
        Circle("черный", 10.0),
        Circle("белый", 15.0),
        Circle("белый", 20.0),
        Rectangle("черный", 20.0, 30.0),
        Rectangle("черный", 25.0, 35.0),
    )

    val blackFiguresPerimeter = allFigures.filter { it.color == "черный" }.sumOf { it.getPerimeter() }
    println("Сумма периметров всех черных фигур: $blackFiguresPerimeter")
    val whiteFiguresArea = allFigures.filter { it.color == "белый" }.sumOf { it.getArea() }
    println("Сумма площадей всех белых фигур: $whiteFiguresArea")

}