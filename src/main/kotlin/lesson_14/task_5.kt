package org.example.lesson_14

class Chat(
    private val messages: MutableList<Message> = mutableListOf(),
    private var nextId: Int = 1,
) {

    fun addMessage(author: String, text: String) {
        messages.add(Message(nextId++, author, text))
    }

    fun addThreadMessage(author: String, text: String, parentMessageId: Int): Any {
        return if (messages.any { it.id == parentMessageId }) {
            messages.add(ChildMessage(nextId++, author, text, parentMessageId))
        } else {
            println("Message with id $parentMessageId not found")
        }
    }

    fun printChat() {

        val groupedMessages = messages.groupBy { msg ->
            if (msg is ChildMessage) msg.parentMessageId else msg.id
        }

        for (message in messages) {

            if (message !is ChildMessage)
                println("${message.author}: ${message.text}")
            val threadMessages = groupedMessages[message.id]?.filterIsInstance<ChildMessage>() ?: emptyList()

            for (threadMessage in threadMessages) {
                println(
                    "\t${threadMessage.author}: ${threadMessage.text}"
                )
            }

        }

    }

}

open class Message(
    val id: Int,
    val author: String,
    val text: String,
)

class ChildMessage(
    id: Int,
    author: String,
    text: String,
    val parentMessageId: Int,
) : Message(id, author, text)

fun main() {

    val chat = Chat()

    chat.addMessage("Петр", "Всем привет!")
    chat.addMessage("Вася", "Привет, Петр!")
    chat.addThreadMessage("Ваня", "Привет!", parentMessageId = 1)
    chat.addThreadMessage("Сергей", "Как дела?", parentMessageId = 4)
    chat.addThreadMessage("Олег", "Привет Вася!", parentMessageId = 2)

    chat.printChat()

}