package org.example.lesson_6

fun main() {

    println("Регистрация аккаунта")
    print("Придумайте логин:")
    val newLogin = readln()
    print("ВПридумайте пароль:")
    val newPassword = readln()
    println("Регистрация прошла успешно")
    println("Авторизация")

    while (true) {

        print("Введите логин:")
        val inputLogin = readln()
        print("Введите пароль:")
        val inputPassword = readln()
        if (inputLogin == newLogin && inputPassword == newPassword) {
            println("Авторизация прошла успешно")
            break
        } else {
            println("Неверный логин или пароль. Попробуйте еще раз")
            continue
        }

    }

}