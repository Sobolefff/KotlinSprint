package org.example.lesson_9

fun main() {
    val soup = listOf("мясо", "картофель", "лук", "свекла", "капуста", "морковь", "соль", "перец", "уксус")
    println("В рецепте есть следующие ингредиенты:")
    soup.forEach { println(it) }
}