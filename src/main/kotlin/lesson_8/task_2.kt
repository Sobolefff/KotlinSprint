package org.example.lesson_8

fun main() {
    val soup = arrayOf("мясо", "картофель", "лук", "свекла", "капуста", "морковь", "соль", "перец", "уксус")
    println("Поиск ингредиента в рецепте:")
    print("Введите ингредиент: ")
    val ingredient = readln()
    for (i in soup) {
        if (i == ingredient) {
            println("Ингредиент \"$ingredient\" в рецепте есть")
            return
        } else println("Ингредиента \"$ingredient\" в рецепте нет")
        return
    }

}