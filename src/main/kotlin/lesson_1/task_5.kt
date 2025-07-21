package org.example.lesson_1

const val SECONDS_PER_MINUTE = 60

fun main() {

    val secondsInSpace = 6480

    println("Гагарин провел в космосе: ${getFormattedTime(secondsInSpace)}")

}

fun getFormattedTime(totalSeconds:Int): String {
    val secondsPerHour = SECONDS_PER_MINUTE * SECONDS_PER_MINUTE
    val hours = totalSeconds / secondsPerHour
    val minutes = (totalSeconds % secondsPerHour) / SECONDS_PER_MINUTE
    val seconds = totalSeconds % SECONDS_PER_MINUTE
    return "%02d:%02d:%02d".format(hours, minutes, seconds)

}