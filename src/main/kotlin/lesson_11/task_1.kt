package org.example.lesson_11

class User1(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,

    )

fun main() {

    val user1 = User1(
        id = 1,
        login = "Alex",
        password = "123",
        email = "alex@gmail.com",
    )
    val user2 = User1(
        id = 2,
        login = "Bob",
        password = "123",
        email = "bob@gmail.com",
    )

    println("User1:")
    println("ID: ${user1.id}")
    println("Login: ${user1.login}")
    println("Password: ${user1.password}")
    println("Email: ${user1.email}")
    println()
    println("User2:")
    println("ID: ${user2.id}")
    println("Login: ${user2.login}")
    println("Password: ${user2.password}")
    println("Email: ${user2.email}")


}