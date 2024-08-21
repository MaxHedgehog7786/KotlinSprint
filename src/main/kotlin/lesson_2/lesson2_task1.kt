package org.example.lesson_2

fun main() {
    val countOfStudents: Int = 4
    val firstScore = 3
    val secondScore = 4
    val thirdScore = 3
    val fourthScore = 5

    val sumOfScores = (firstScore + secondScore + thirdScore + fourthScore).toDouble()
    val averageScore = sumOfScores / countOfStudents

    println(String.format("%.02f", averageScore))
}