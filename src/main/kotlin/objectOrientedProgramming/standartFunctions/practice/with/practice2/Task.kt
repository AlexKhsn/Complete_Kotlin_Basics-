package objectOrientedProgramming.standartFunctions.practice.with.practice2

fun main() {
    val store = Store()

    with(store) {
        shoes = 5
        shirts = 123
        jackets = 32

        printInventory()
    }
}
