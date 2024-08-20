package org.example.lesson_2

fun main() {
    val countOfPermanentEmployees = 50
    val salaryPermanentEmployees = 30000
    val countOfInterns = 30
    val salaryInterns = 20000
    val summarySalaryPermanent = countOfPermanentEmployees*salaryPermanentEmployees
    val salaryAllEmployees = summarySalaryPermanent+countOfInterns*salaryInterns
    val averageSalary = salaryAllEmployees/(countOfInterns+countOfPermanentEmployees)
    println(summarySalaryPermanent)
    println(salaryAllEmployees)
    println(averageSalary)
}