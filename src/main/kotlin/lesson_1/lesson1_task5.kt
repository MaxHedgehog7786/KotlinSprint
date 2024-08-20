package org.example.lesson_1

fun main() {
    val seconds: Short = 6480
    val secondsPerMinute: Byte = 60
    val minutes: Int = seconds/secondsPerMinute
    val secondsRemains: Int = seconds%secondsPerMinute
    val hours: Int = minutes/secondsPerMinute
    val minutesRemains: Int = minutes%secondsPerMinute
    print(String.format("%02d:%02d:%02d", hours,minutesRemains, secondsRemains))

}