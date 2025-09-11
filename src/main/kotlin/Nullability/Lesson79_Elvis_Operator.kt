package org.example.Nullability

fun main(Args : Array<String>) {
    var catName: String? = null
    println(catName?:"This cat has no name")
    println(catName?:"Meat".length)
}