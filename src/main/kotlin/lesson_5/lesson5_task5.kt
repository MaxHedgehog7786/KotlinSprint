package org.example.lesson_5

import kotlin.random.Random

fun main() {
    val listOfNumbers = listOf(Random.nextInt(MAX_NUMBER), Random.nextInt(MAX_NUMBER), Random.nextInt(MAX_NUMBER))
    println("Введите три числа: ")
    val userNumbers = listOf(readln().toInt(), readln().toInt(), readln().toInt())
    val numberOfMatches = listOfNumbers.intersect(userNumbers.toSet()).size

    when (numberOfMatches) {
        3 -> println("Вы угадали все три числа и выиграли джекпот!")
        2 -> println("Вы угадали два числа и выиграли крупный приз")
        1 -> println("Вы угадали одно число и выиграли утешительный приз!")
        else -> println("Вы не угадали ни одного числа")
    }

    println("Выигрышные числа: ${listOfNumbers.sorted().joinToString { it.toString() }}")

}

const val MAX_NUMBER = 42