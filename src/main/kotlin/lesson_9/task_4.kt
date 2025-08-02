package org.example.lesson_9

fun main() {

    print("Введи 5 ингредиентов через запятую: ")

    val ingredients = readln()
        .split(",")
        .map { it.trim() }

    val sortedIngredients = ingredients.sorted()

    println("Ингредиенты в алфавитном порядке: ")

    sortedIngredients.forEach {
        println(it)
    }

}
