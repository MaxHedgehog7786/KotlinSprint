package org.example.lesson_2

fun main() {
    val minutesOfArrival: Int = 9*60+39+457
    println(String.format("%02d:%02d", minutesOfArrival/60, minutesOfArrival%60))
}