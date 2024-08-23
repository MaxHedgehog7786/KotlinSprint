package org.example.lesson_5

import java.util.Calendar

fun main() {
    println("Введите год вашего рождения: ")
    val userBirthYear = readln().toInt()
    val todayYear = Calendar.getInstance().get(Calendar.YEAR)
    val userAge = todayYear - userBirthYear

    if (userAge >= MIN_AGE) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Доступ запрещен")
    }

}

const val MIN_AGE = 18