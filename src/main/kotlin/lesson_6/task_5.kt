package org.example.lesson_6

import java.util.*

fun main() {
    var tryCount = 1

    println("Для регистрации нового пользователя необходимо пройти проверку на бота")
    println("У вас есть 3 попытки")

    while (true) {

        val firstNumber = Random().nextInt(1, 10)
        val secondNumber = Random().nextInt(1, 10)
        print("Попытка №$tryCount. Решите пример: $firstNumber + $secondNumber = ")

        if (readln().toInt() == firstNumber + secondNumber) {
            println("Вы прошли проверку")
            break
        } else {
            tryCount++
            if (tryCount <= 3) {
                println("Неверный ответ. Попробуйте еще раз")
            } else {
                println("Вы не смогли пройти проверку")
                return
            }
        }

    }

    println("Регистрация аккаунта")
    print("Придумайте логин:")
    val newLogin = readln()
    print("Придумайте пароль:")
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
            return
        } else {
            println("Неверный логин или пароль. Попробуйте еще раз")
        }

    }
}