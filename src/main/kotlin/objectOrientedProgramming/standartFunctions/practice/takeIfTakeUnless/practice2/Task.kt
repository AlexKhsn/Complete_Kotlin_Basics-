package objectOrientedProgramming.standartFunctions.practice.takeIfTakeUnless.practice2

fun main() {
    val names = listOf("Alex", "John", "Antond", "Pes", "Dodik", "Poshel Na Hui", "Olga")
    val filteredNames = mutableListOf<String>()

    for (name in names) {
        name.takeUnless { it.lowercase()[0] == 'a' }
            ?.let { filteredNames.add(it) }
    }

    println(names)
    println(filteredNames)
}
