package functions.functionsContinued

val year = 2007

fun main() {
    //  Exercise 1

    val year = 2015
    year()
    year2()
    print("Year inside main function is $year")

    println()

    // Exercise 2

    var parakeets = 5
    buyMoreParakeets(parakeets)
    println("You now have $parakeets parakeets")
}

fun year() {
    val year = 1985
    println("Year inside function is $year")
}

fun year2() {
    println("Year inside function without valuable is $year")
}

fun buyMoreParakeets(parakeets: Int) {
    var parakeets = 3
}
