package flowControl.ifConditional

fun main() {
    // Exercise 1

    println("Do you have a key?")
    val keyInp = (readln() ?: "")
    var hasKey = false

    if (keyInp == "yes") {
        hasKey = true
    }

    if (hasKey) {
        println("Car is started")
    } else {
        println("Search a key!")
    }

    // Exercise 2

    println("What time is it now?")
    val inpTime = (readln() ?: "0").toInt()

    if (inpTime < 12) {
        println("It's $inpTime AM")
    } else {
        if (inpTime == 12) {
            println("Its $inpTime AM")
        }
        println("It's ${inpTime - 12} PM")
    }

    // Exercise 3

    val hasEggs = true
    val hasBacon = false
    var total = 0

    if (hasEggs) {
        total += 12 * 5

        if (hasBacon) {
            total += 2 * 20
            println("You bought eggs and bacon for $total$")
        } else {
            println("You bought eggs for $total$")
        }
    } else {
        println("You bought nothing")
    }

    // Exercise 4

    println("Введи число: ")
    val number = (readln() ?: "").toInt()
    val message = if (number / 10 == 0) "$number is a single digit" else "$number is not a single digit"

    println(message)

    // Exercise 5

    val response = 404
    val answer = if (response >= 500) {
        "Server error"
    } else if (response >= 400) {
        "Client error"
    } else if (response >= 300) {
        "Redirect"
    } else if (response >= 200) {
        "Success"
    } else {
        "Information response"
    }

    println("Response code $response means $answer")

    // Exercise 6

    println("Write your grade (0 - 100): ")
    val grade = (readln() ?: "").toInt()
    val convertedGrade = if (grade >= 90) {
        "A"
    } else if (grade >= 80) {
        "B"
    } else if (grade >= 70) {
        "C"
    } else if (grade >= 60) {
        "D"
    } else if (grade >= 50) {
        "E"
    } else {
        "F"
    }

    println("Your grade '$grade' converted to '$convertedGrade'")
}
