package org.example.lesson_7

fun main() {

    val password = getPassword(6)
    println(password)

}

fun getPassword(length: Int): String {
    val letters = ('a'..'z')
    val digits = ('0'..'9')
    return (1..length)
        .map {
            if (it % 2 == 0) letters.random()
            else digits.random()
        }
        .joinToString("")
}