package org.example.lesson_2

fun main() {
    val hourOfDeparture = 9
    val minutesOfDeparture = 39
    val secondsPerMinute = 60
    val roadTime = 457
    val minutesOfArrival: Int = hourOfDeparture * secondsPerMinute + minutesOfDeparture + roadTime
    println(String.format("%02d:%02d", minutesOfArrival / secondsPerMinute, minutesOfArrival % secondsPerMinute))
}