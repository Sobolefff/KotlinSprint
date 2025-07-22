package org.example.lesson_2

import java.time.LocalTime

fun main() {

    val startHour = 9
    val startMinute = 39
    val travelTimeInMinutes: Long = 457
    val finishTime = LocalTime.of(startHour, startMinute).plusMinutes(travelTimeInMinutes)

    println("Время прибытия поезда: $finishTime")

}