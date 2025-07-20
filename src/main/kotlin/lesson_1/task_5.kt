package org.example.lesson_1

const val SECONDS_PER_MINUTE = 60

fun main() {

    val secondsInSpace = 6480

    println("Гагарин провел в космосе: ${getFormattedTime(secondsInSpace)}")

}

fun getFormattedTime(totalSeconds:Int): String {
    val secondsPerHour = SECONDS_PER_MINUTE * 60
    val hours = totalSeconds / secondsPerHour
    val minutes = (totalSeconds % secondsPerHour) / 60
    val seconds = totalSeconds % 60
    return "%02d:%02d:%02d".format(hours, minutes, seconds)

}