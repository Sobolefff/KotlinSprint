package org.example.lesson_8

fun main() {

    val soup = arrayOf("мясо", "картофель", "лук", "свекла", "капуста", "морковь", "соль", "перец", "уксус")
    println("Рецепт борща: ${soup.joinToString(", ")}")
    print("Ведите название ингредиента, который вы хотели бы поменять: ")
    val inputChangeIngredientIndex = soup.indexOf(readln())

    if (inputChangeIngredientIndex != -1) {
        print("Введите название ингредиента, на который хотите заменить \"${soup[inputChangeIngredientIndex]}\": ")
        val inputIngredientForChange = readln()
        soup[inputChangeIngredientIndex] = inputIngredientForChange
        println("Рецепт борща: ${soup.joinToString(", ")}")
    } else println("Такого ингредиента нет в рецепте")

}