package org.example.lesson_4

fun main() {
    val reservedTablesToday = 13
    val reservedTablesTomorrow = 9

    println("Доступность столиков на сегодня: ${reservedTablesToday < COUNT_OF_TABLES}")
    println("Доступность столиков на завтра: ${reservedTablesTomorrow < COUNT_OF_TABLES}")
}


const val COUNT_OF_TABLES = 13