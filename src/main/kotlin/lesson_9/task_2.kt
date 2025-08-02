package org.example.lesson_9

fun main() {
    val soup = mutableListOf("мясо", "картофель", "свекла")
    println("В рецепте есть следующие базовые ингредиенты:")
    soup.forEach { println(it) }
    print("Желаете добавить что-нибудь?(да/нет): ")
    if (readln().equals("да", ignoreCase = true)) {
        println("Введите название ингредиента: ")
        val newIngredient = readln()
        if (soup.contains(newIngredient)) {
            println("Такой ингредиент уже есть в рецепте")
        } else {
            println("Такого ингредиента нет в рецепте, добавляем его")
            soup.add(newIngredient)
            soup.forEach { println(it) }
        }
    } else return
}