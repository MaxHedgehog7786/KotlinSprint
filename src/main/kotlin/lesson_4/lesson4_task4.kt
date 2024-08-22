package org.example.lesson_4

fun main() {
    val trainingDay = 5
    val isOddDay = trainingDay % 2 == 1
    val isEvenDay = !isOddDay

    println("""Упражнения для рук: $isOddDay
        |Упражнения для ног: $isEvenDay
        |Упражнения для спины: $isEvenDay
        |Упражнения для пресса: $isOddDay
    """.trimMargin())
}
