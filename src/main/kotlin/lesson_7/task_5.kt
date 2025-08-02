package org.example.lesson_7

fun main() {
    print("Enter password length: ")
    val length = readln().toInt()
    if (length < 6) {
        println("Password too short! It must be at least 6 characters.")
    } else {
        val newPassword = getDifficultPassword(length)
        println(newPassword)
    }
}

fun getDifficultPassword(length: Int): String {

    val lowerChars = ('a'..'z').toList()
    val upperChars = ('A'..'Z').toList()
    val digits = ('0'..'9').toList()
    val allChars = lowerChars + upperChars + digits
    val stringBuild = StringBuilder()
    stringBuild.append(lowerChars.random())
    stringBuild.append(upperChars.random())
    stringBuild.append(digits.random())
    repeat(length - 3) { stringBuild.append(allChars.random()) }
    return stringBuild.toList().shuffled().joinToString("")
}