package org.example.lesson_3

fun main() {
    val moveReceived = "D2-D4;0"
    val moveArray = moveReceived.split("-", ";")
    val startCell = moveArray[0]
    val endCell = moveArray[1]
    val moveNumber = moveArray[2]

    print("""$startCell 
        |$endCell
        |$moveNumber""".trimMargin())
}