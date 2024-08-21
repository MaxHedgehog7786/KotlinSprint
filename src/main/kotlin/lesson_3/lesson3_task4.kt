package org.example.lesson_3

fun main() {
    //Объявление и инициализация переменных для стартовой и конечной клетки и номера хода
    var startColumn = 'E'
    var startRow = 2
    var endColumn = 'E'
    var endRow = 4
    var moveNumber = 1

    //Формировние строки для сервера
    var move = "[$startColumn$startRow-$endColumn$endRow; $moveNumber]"

    println(move)

    //Изменение значений переменных
    startColumn = 'D'
    startRow = 2
    endColumn = 'D'
    endRow = startRow + 1
    moveNumber++

    //Формирование строки для сервера
    move = "[$startColumn$startRow-$endColumn$endRow; $moveNumber]"

    println(move)
}