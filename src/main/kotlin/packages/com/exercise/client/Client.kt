package packages.com.exercise.client

import packages.com.exercise.hello.sayHi

fun getName() {
    println("What's your name? ")
    val name = readln() ?: ""
    sayHi(name)
}
