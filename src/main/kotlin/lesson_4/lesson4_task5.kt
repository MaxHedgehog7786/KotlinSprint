package org.example.lesson_4

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Корабль имеет повреждения? (true/false)")
    val condition = scanner.nextBoolean()
    println("Сколько членов экипажа?")
    val crewCount = scanner.nextInt()
    println("Сколько ящиков провизии?")
    val provisionCount = scanner.nextInt()
    println("Метеоусловия благоприятны? (true/false)")
    val weather = scanner.nextBoolean()

    println("Взлет разрешен: ${(condition == IS_DAMAGED && crewCount in MIN_CREW..MAX_CREW && provisionCount > MIN_PROVISION) || (crewCount == MAX_CREW && weather == IS_GOOD_WEATHER && provisionCount >= 50)}")
}

const val IS_DAMAGED = false
const val MIN_CREW = 55
const val MAX_CREW = 70
const val MIN_PROVISION = 50
const val IS_GOOD_WEATHER = true