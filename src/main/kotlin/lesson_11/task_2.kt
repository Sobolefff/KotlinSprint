package org.example.lesson_11

class User2 (
    val id: Int,
    val login: String,
    var password: String,
    var email: String,
    var bio: String? = null,
    )
{
    fun getUserInfo() {
        println("User id: $id, login: $login, password: $password, email: $email, bio: ${bio ?: "No bio"}")
    }
    fun writeBio() {
        val inputBio = readln()
        bio = inputBio
    }
    fun changePassword() {
        print("Enter old password: ")
        val inputPassword = readln()
        return if (inputPassword == password) {
            print("Enter new password: ")
            password = readln()
        } else println("Wrong password")
    }
}

fun main() {

    val user = User2(
        id = 1,
        login = "admin",
        password = "12345",
        email = "admin@gmail.com",
    )

    user.getUserInfo()
    print("Enter new bio: ")
    user.writeBio()
    user.changePassword()
    user.getUserInfo()

}

