package org.example.lesson_5

fun main() {
    val firstNumber = 21
    val secondNumber = 37

    println("Введите первое число (от 0 до 42): ")
    val firstUserNumber = readln().toInt()
    println("Введите второе число (от 0 до 42): ")
    val secondUserNumber = readln().toInt()

    if ((firstUserNumber == firstNumber && secondUserNumber == secondNumber)
        || (secondUserNumber == firstNumber && firstUserNumber == secondNumber)
    ) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (firstNumber != firstUserNumber && secondNumber != secondUserNumber &&
        firstNumber != secondUserNumber && secondNumber != firstUserNumber
    ) {
        println("Неудача!")
    } else {
        println("Вы выиграли утешительный приз!")
    }

    println("Для победы нужны были числа: $firstNumber и $secondNumber")
}
