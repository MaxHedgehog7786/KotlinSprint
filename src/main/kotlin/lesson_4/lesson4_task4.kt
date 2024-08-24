package org.example.lesson_4

fun main() {
    val trainingDay = 5
    val isOddDay = trainingDay % 2 == 1

    println(
        """Упражнения для рук: $isOddDay
        |Упражнения для ног: ${!isOddDay}
        |Упражнения для спины: ${!isOddDay}
        |Упражнения для пресса: $isOddDay
    """.trimMargin()
    )
}
