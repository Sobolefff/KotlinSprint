package org.example.lesson_4

const val TOTAL_SEATS = 13

fun main() {

    val todayBooked = 13
    val tomorrowBooked = 9

    println(
        "Доступность столиков на сегодня: ${todayBooked < TOTAL_SEATS}\nДоступность столиков на завтра: ${tomorrowBooked < TOTAL_SEATS}"
    )

}