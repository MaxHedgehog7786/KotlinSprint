package org.example.lesson_1

fun main() {
    val seconds: Short = 6480
    val minutes: Int = seconds/60
    val secondsRemains: Int = seconds%60
    val hours: Int = minutes/60
    val minutesRemains: Int = minutes%60
    print(String.format("%02d:%02d:%02d", hours,minutesRemains, secondsRemains))

}