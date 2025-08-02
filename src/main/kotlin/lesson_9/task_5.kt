package org.example.lesson_9

fun main() {

    val recipe = MutableList(5) { "" }
    var indexOfIngredients = 0

    println("Заполни рецепт из 5 ингредиентов.")

    while (indexOfIngredients < recipe.size) {

        print("Введите ингредиент №${indexOfIngredients + 1}: ")
        val ingredient = readln()

        if (ingredient in recipe) {
            println("Такой ингредиент уже есть в списке. Введите другой.")
            continue
        }

        recipe[indexOfIngredients] = ingredient
        indexOfIngredients++

    }

    recipe.sort()
    println("Ваш рецепт: ${recipe.joinToString(", ").replaceFirstChar { it.uppercase() }}")

}
