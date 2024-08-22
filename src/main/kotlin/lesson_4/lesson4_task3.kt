package org.example.lesson_4

fun main() {
    val sunToday = true
    val openedToday = true
    val humidityToday = 20
    val seasonToday = "winter"

    println("Благоприятные ли условия сейчас для роста бобовых? ${sunToday == IS_SUNNY && openedToday == IS_OPENED && 
            humidityToday == HUMIDITY && seasonToday != BAD_SEASON}")
}

const val IS_SUNNY = true
const val IS_OPENED = true
const val HUMIDITY = 20
const val BAD_SEASON = "winter"