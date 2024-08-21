package org.example.lesson_3

fun main() {
    val moveReceived = "D2-D4;0"

    val startCell = moveReceived.substring(0,2)
    val endCell = moveReceived.substring(3,5)
    val moveNumber = moveReceived.substring(6)

    print("""$startCell 
        |$endCell
        |$moveNumber""".trimMargin())
}