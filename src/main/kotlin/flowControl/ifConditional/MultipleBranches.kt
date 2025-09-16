package flowControl.ifConditional

fun main() {
    println("Choose an animal (dog/cat/crocodile")
    val animal = readln() ?: ""
    val action = if (animal == "dog") {
        "Pet It"
    } else if (animal == "cat") {
        "Feed It"
    } else if (animal == "crocodile") {
        "Run Away"
    } else {
        "Google It"
    }

    println(action)
}
