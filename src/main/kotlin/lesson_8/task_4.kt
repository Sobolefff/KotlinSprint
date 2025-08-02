package org.example.lesson_8

fun main() {

    val soup = arrayOf("мясо", "картофель", "лук", "свекла", "капуста", "морковь", "соль", "перец", "уксус")
    println("Рецепт борща: ${soup.joinToString(", ")}")
    print("Ведите название ингредиента, который вы хотели бы поменять: ")
    val inputChangeIngredient = readln()
    if (soup.contains(inputChangeIngredient)) {
        print("Введите название ингредиента, на который хотите заменить \"$inputChangeIngredient\": ")
        val inputIngredientForChange = readln()
        val index = soup.indexOf(inputChangeIngredient)
        soup[index] = inputIngredientForChange
        println("Рецепт борща: ${soup.joinToString(", ")}")
    } else println("Такого ингредиента нет в рецепте")

}