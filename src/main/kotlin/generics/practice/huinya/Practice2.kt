package generics.practice.huinya

fun main() {
    val type1 = Type<Float>()
    type1.message(23.32F)
    val type2 = Type<HashMap<String, Int>>()
    type2.message(
        hashMapOf(
            "alex" to 23,
            "sdf" to 23,
            "sfg" to 35,
        ),
    )
}

class Type<T> {
    fun message(item: T) {
        println("The item converted to a string is: '$item'")
    }
}
/**
 * Create a class that takes a generic type T, and has a function that converts the type to String
 * and prints a message that includes the argument passed.
 * Instantiate the class with different types and call the function.
 */
