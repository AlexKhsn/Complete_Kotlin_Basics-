package objectOrientedProgramming.standartFunctions.practice.takeIfTakeUnless.practice1

fun main() {
    val numbers = listOf(32, 21, 23, 54, 11, 4, 65, 36, 87, 234, 534, 853, 123)
    val evenNumbers = mutableListOf<Int>()

    for (number in numbers) {
        number.takeIf { it % 2 == 0 }
            ?.let {
                evenNumbers.add(it)
            }
    }

    println("Even numbers: $evenNumbers")
}
