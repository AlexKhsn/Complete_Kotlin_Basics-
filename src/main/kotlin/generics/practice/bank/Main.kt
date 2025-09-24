package generics.practice.bank

fun main() {
    val names = PiggyBank<String>()
    val numbers = PiggyBank<Int>()
    val people = PiggyBank<Person>()

    names.add("Alex")
    names.add("Bob")
    names.add("Dodik")

    numbers.add(2)
    numbers.add(23)
    numbers.add(12)

    people.add(Person("Alex", 23))
    people.add(Person("Degan", 212))

    println(names.getAll())
    println(numbers.getAll())
    println(people.getAll())

    names.count()
    numbers.count()
    people.count()
}
