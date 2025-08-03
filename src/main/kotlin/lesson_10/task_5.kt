package org.example.lesson_10

const val LOGIN = "user"
const val PASSWORD = "pass"
const val TOKEN_LENGTH = 32

fun main() {

    println("Вход в интернет-магазин")
    print("Введите логин: ")
    val inputLogin = readln()
    print("Введите пароль: ")
    val inputPassword = readln()

    val token = authorizeUser(inputLogin, inputPassword)

    if (token != null) {
        println("Добро пожаловать в интернет-магазин")
        println("Ваш токен: $token")
        println("Ваша корзина: ${getCart(token)}")
    } else {
        println("Неверный логин или пароль")
    }

}

fun authorizeUser(login: String, password: String): String? {
    return if (LOGIN == login && PASSWORD == password) {
        val token = getToken()
        token
    } else null
}

fun getToken(): String {

    val lowerChars = ('a'..'z').toList()
    val upperChars = ('A'..'Z').toList()
    val digits = ('0'..'9').toList()
    val allChars = lowerChars + upperChars + digits
    val stringBuild = StringBuilder()

    stringBuild.append(lowerChars.random())
    stringBuild.append(upperChars.random())
    stringBuild.append(digits.random())

    repeat(TOKEN_LENGTH - 3) { stringBuild.append(allChars.random()) }

    return stringBuild.toList().shuffled().joinToString("")

}

fun getCart(token: String): String {

    val cartStorage = mutableMapOf<String, List<String>>()
    cartStorage[token] = listOf("телефон", "ноутбук", "телевизор")
    return cartStorage[token]?.joinToString(", ") ?: ""

}