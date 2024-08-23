package org.example.lesson_5

import kotlin.random.Random

fun main() {
    val maxNumber = 10
    val firstNumber = Random.nextInt(maxNumber)
    val secondNumber = Random.nextInt(maxNumber)
    val captcha = "Чтобы доказать, что вы не бот, сложите два числа: $firstNumber и $secondNumber"

    println(captcha)
    val userAnswer = readln().toInt()

    if (userAnswer == firstNumber + secondNumber){
        println("Добро пожаловать!")
    } else{
        println("Вход запрещен.")
    }
}