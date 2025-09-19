package userInput

fun main() {
    println("Введи хуйню: ")

    var input: String? = readLine()
    if (input == "111") {
        input = null
    }

//     будет ошибка, если input == 111
//    println("Input was: ${input!!.length}")

//    // будет null, если input == 111
//    println("Input was: ${input?.length}")

//    // будет null, если input == 111
//    println("Input was: ${input?.length ?: "Empty input"}")

//    // будет null, если input == 111
    if (input != null) {
        println("Input was: ${input.length}")
    } else {
        println("Empty input")
    }
    println("Input was: ${input?.toInt()?.javaClass }")

//    println("Input was: $input")
}
