package org.example.lesson_11

data class RecipeCategory (
    val picture: String,
    val title: String,
    val description: String,
    val recipesList: MutableList<Recipe>,
)

data class Recipe (
    val picture: String,
    val title: String,
    val ingredients: MutableList<Ingredient>,
    val servingCount: Int,
    val instructions: String,
)

data class Ingredient (
    val name: String,
    val quantity: Int,
    val unit: String,
)

fun main() {



}