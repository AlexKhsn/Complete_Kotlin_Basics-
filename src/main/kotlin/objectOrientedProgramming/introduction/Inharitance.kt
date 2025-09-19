package objectOrientedProgramming.introduction

fun main() {
    val myDoggy = Corgi()
    myDoggy.name = "Reks"
    myDoggy.size = 10
    println(myDoggy.size)
    myDoggy.bark()
    myDoggy.play()
    println(myDoggy.name)
    myDoggy.hide()
}

open class Animal {
    var name = ""

    fun hide() {
        println("$name hides")
    }
}

open class Dog : Animal() {
    var size = 0

    fun bark() {
        println("Bark")
    }

    fun play() {
        println("Play")
    }
}

class Corgi : Dog()
