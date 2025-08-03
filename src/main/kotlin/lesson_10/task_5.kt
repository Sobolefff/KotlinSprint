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
        println("Ваша корзина: ${getCart(token).joinToString(", ")}")
    } else {
        println("Неверный логин или пароль")
    }

}

fun authorizeUser(login: String, password: String): String? {
    return if (LOGIN == login && PASSWORD == password) {
        getToken()
    } else null
}

fun getToken(): String {

    val lowerChars = ('a'..'z')
    val upperChars = ('A'..'Z')
    val digits = ('0'..'9')
    val allChars = lowerChars + upperChars + digits
    val token = mutableListOf<Char>()

    token.add(lowerChars.random())
    token.add(upperChars.random())
    token.add(digits.random())

    repeat(TOKEN_LENGTH - 3) { token.add(allChars.random()) }

    return token.shuffled().joinToString("")

}

fun getCart(token: String): List<String> = listOf("телефон", "ноутбук", "телевизор")