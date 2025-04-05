package org.example.lesson_1

fun main() {
    val seconds: Int = 6480

    val hours = seconds / 3600
    val minutes = (seconds % 3600) / 60
    val remainingSeconds = seconds % 60

    val formattedHours = String.format("%02d", hours)
    val formattedMinutes = String.format("%02d", minutes)
    val formattedSeconds = String.format("%02d", remainingSeconds)

    println("$formattedHours:$formattedMinutes:$formattedSeconds")
}