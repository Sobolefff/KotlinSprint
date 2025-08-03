package org.example.lesson_9

fun main() {

    val recipe = mutableSetOf<String>()

    println("Заполни рецепт из 5 ингредиентов.")

    while (recipe.size < 5) {

        print("Введите ингредиент №${recipe.size + 1}: ")
        val ingredient = readln()

        val wasAdded = recipe.add(ingredient)

        if (!wasAdded) {
            println("Такой ингредиент уже есть в списке. Введите другой.")
        }

    }

    recipe.sorted()
    println("Ваш рецепт: ${recipe.joinToString(", ").replaceFirstChar { it.uppercase() }}")

}
