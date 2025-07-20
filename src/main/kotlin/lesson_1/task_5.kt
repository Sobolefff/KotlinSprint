package org.example.lesson_1

fun main() {

    val secondsInSpace = 6480

    println("Гагарин провел в космосе: ${getFormattedTime(secondsInSpace)}")

}

fun getFormattedTime(seconds:Int): String {
    val hours = seconds / 3600
    val minutes = (seconds % 3600) / 60
    val seconds = seconds % 60
    return String.format("%02d:%02d:%02d", hours, minutes, seconds)
}