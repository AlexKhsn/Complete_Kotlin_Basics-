package org.example.Strings_and_variables

//  Константы нельзя изменить
//  Константы объявляются и инициализируются сразу в глобальной области ВНЕ ФУНКЦИЙ!
//  Константы объявляются через "const val"
//  Имя константы записывается капслоком, так сразу видно где константа

const val URL_LINK = "http://google.com"


fun main(args : Array<String>) {
    println("Accessing url: $URL_LINK")
}