package org.example.lesson_10

fun main() {

    println("Регистрация пользователя:")
    print("Введите логин: ")
    val login = readln()

    if (!validateLength(login)) {
        println("Логин слишком короткий")
    } else {
        print("Введите пароль: ")
        val password = readln()

        if (!validateLength(password)) {
            println("Пароль слишком короткий")
        } else println("Пользователь зарегистрирован")
    }

}

fun validateLength(input: String): Boolean = input.length >= 4