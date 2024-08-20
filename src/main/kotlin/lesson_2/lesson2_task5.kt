package org.example.lesson_2

import kotlin.math.pow

fun main() {
    val startSum = 70_000
    val percent = 0.167
    val ages = 20
    val finalSum = startSum * (1 + percent).pow(ages)
    println(String.format("%.3f", finalSum))
}