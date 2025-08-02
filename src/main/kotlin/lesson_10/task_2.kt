package org.example.lesson_10

fun main() {

    println("Регистрация пользователя:")
    print("Введите логин: ")
    val login = readln()

    if (validateLength(login.length)) {
        println("Логин слишком короткий")
    } else {
        print("Введите пароль: ")
        val password = readln()

        if (validateLength(password.length)) {
            println("Пароль слишком короткий")
        }
    }
    println("Пользователь зарегистрирован")

}

fun validateLength(length: Int): Boolean {
    return length < 4
}