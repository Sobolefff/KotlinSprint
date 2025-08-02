package org.example.lesson_8

fun main() {

    print("Введите количество ингредиентов в рецепте: ")
    val length = readln().toInt()
    val ingredients = Array(length) {""}
    for (i in ingredients.indices) {
        print("Введите ${i+1} ингредиент: ")
        ingredients[i] = readln()
    }
    println("Получившийся рецепт ${ingredients.joinToString(", ")}")

}