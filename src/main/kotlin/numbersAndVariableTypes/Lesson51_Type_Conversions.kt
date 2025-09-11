package numbersAndVariableTypes

fun main(args: Array<String>) {
    val cats = 3
    println(cats::class.java)
    val longCats = cats.toLong()
    println(longCats::class.java)
    println(longCats)

    println()

    val people = 75000000000
    val fewPeople = people.toInt()
    println(people::class.java)
    println(fewPeople::class.java)
    println(people)
    println(fewPeople)

    println()

    val dogs = 5
    val byteDogs = dogs.toByte()
    println(byteDogs::class.java)
    val floatDogs = dogs.toFloat()
    println(floatDogs::class.java)

    println()
    // Converting any variable into a String

    val squirrels = 3
    println(squirrels::class.java)
    val squirrelsString = squirrels.toString()
    println(squirrelsString::class.java)

    val pi = 3.14159265358979
    println(pi::class.java)
    val piString = pi.toString()
    println(piString::class.java)
}
