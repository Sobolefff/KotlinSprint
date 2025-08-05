package org.example.lesson_11

// Я чет сначала перемудрил, а потом уже не мог остановиться)
// Если я слишком усложнил, могу переделать

data class Room(
    val cover: String,
    val title: String,
    var usersList: MutableList<User>,
) {

    fun addUser(user: User) = usersList.add(user)

    fun updateStatus(user: User, status: UserStatus) {
        usersList.find { it.nickName == user.nickName }?.status = status
    }

}

data class User(
    val avatar: String,
    val nickName: String,
    var status: UserStatus,
) {
    override fun toString(): String {
        return "User(avatar=$avatar, nickName=$nickName, status=${status.label})"
    }
}

enum class UserStatus(val label: String) {
    TALKING("Разговаривает"),
    MIC_OFF("Микрофон выключен"),
    MUTED("Пользователь заглушен"),
}

fun main() {

    val user1 = User(
        avatar = "https://i.ytimg.com/vi/568q0T22j0s/maxresdefault.jpg",
        nickName = "Иван",
        status = UserStatus.TALKING,
    )
    val user2 = User(
        avatar = "https://i.ytimg.com/vi/568q0T22j0s/maxresdefault.jpg",
        nickName = "Петр",
        status = UserStatus.MUTED,
    )
    val user3 = User(
        avatar = "https://i.ytimg.com/vi/568q0T22j0s/maxresdefault.jpg",
        nickName = "Сидор",
        status = UserStatus.MIC_OFF,
    )

    val room = Room(
        cover = "https://i.ytimg.com/vi/568q0T22j0s/maxresdefault.jpg",
        title = "Мой первый чат",
        usersList = mutableListOf(),
    )

    room.addUser(user1)
    room.addUser(user2)
    room.addUser(user3)
    room.updateStatus(user1, UserStatus.MIC_OFF)
    println(room)

}

