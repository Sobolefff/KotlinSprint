package org.example.lesson_9

fun main() {
    val ingredients = listOf(
        "Яиц" to 2,
        "Молока" to 50,
        "Сливочного масла" to 15
    )
    print("Введите количество порций: ")
    val portions = readln().toInt()
    println("На $portions порций вам понадобится:")
    for ((name, amount) in ingredients) {
        val totalAmount = amount * portions
        val unit = when (name) {
            "Яиц" -> "шт."
            "Молока" -> "мл."
            "Сливочного масла" -> "гр."
            else -> ""
        }
        println("$name - $totalAmount $unit ")
    }
}
