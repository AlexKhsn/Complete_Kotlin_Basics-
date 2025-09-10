package org.example.Strings_and_variables

fun main(args: Array<String>) {




    //    var - mutable (изменяемая) переменная. Можно изменить и присвоить новое значение

    var weather = "rainy"
    println("It's $weather")
    weather = "sunny"
    println("It's $weather")


    //    val - immutable (неизменяемая) переменная. Значение можно присвоить один раз и нельзя изменить после этого

    val age = 25
    println("I'm $age years old")

    // age = 30 -----------------------ОШИБКА





    //   Значение переменной можно изменить только на тот же тип данных!

    var gender = "male"
    //    gender = 255 ----------------ОШИБКА





    //    Переменную можно объявить и инициализировать позже, но до ее использования! Для этого после объявления нужно указать тип данных

    var name: String
    val surname: String


    name = "Alex"
    surname = "Khomishyn"
    println("My name is $name $surname")

}