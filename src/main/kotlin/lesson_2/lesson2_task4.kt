package org.example.lesson_2

fun main() {
    val countOfCrystal = 7
    val countOfMetal = 11
    val buff = 1.2
    val crystalWithBuff = countOfCrystal * buff
    val metalWithBuff = countOfMetal * buff
    println("Бонус для кристалической руды: ${String.format("%.0f", crystalWithBuff-countOfCrystal)}")
    println("Бонус для металлической руды: ${String.format("%.0f", metalWithBuff-countOfMetal)}")
}