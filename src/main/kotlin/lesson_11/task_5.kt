package org.example.lesson_11

data class Forum(
    val forumMembers: MutableList<ForumMember> = mutableListOf(),
    val thread: MutableList<Message> = mutableListOf(),
    private var nextUserId: Int = 1,
) {

    fun createNewUser(name: String): ForumMember {
        val newUser = ForumMember(
            userId = nextUserId++,
            userName = name,
        )
        forumMembers.add(newUser)
        return newUser
    }

    fun createNewMessage(userId: Int, message: String) {

        val userExists = forumMembers.any { it.userId == userId }

        if (userExists) {
            val newMessage = Message(
                authorId = userId,
                message = message,
            )
            thread.add(newMessage)
        } else println("Пользователя с ID $userId не существует")


    }

    fun printThread(): String {
        return thread.joinToString("\n") { msg ->
            val author = forumMembers.find { it.userId == msg.authorId }?.userName ?: "Неизвестный"
            "$author: ${msg.message}"
        }
    }

}

data class ForumMember(
    val userId: Int,
    val userName: String,
)

data class Message(
    val authorId: Int,
    val message: String,
)

fun main() {

    val forum = Forum()
    val user1 = forum.createNewUser("Никита")
    val user2 = forum.createNewUser("Дюша Метелкин")

    forum.createNewMessage(user1.userId, "Я Никита, меня уносит с одной текилы")
    forum.createNewMessage(user2.userId, "Юсб здесь, здесь все! Никита, Стас, Гена, Турбо и Дюша Метелкин")
    forum.createNewMessage(user1.userId, "Я Никита, разбил голову об пасхальное яйцо")
    forum.createNewMessage(user2.userId, "Наше творчество идет от чистого сердца!")
    forum.createNewMessage(123, "Я Никита,люблю жвачку турбо,")
    println(forum.printThread())

}