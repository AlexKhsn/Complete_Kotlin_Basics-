package generics.practice.practice3

fun main() {
    val money = Money(32423842374682734)
    val jewellery = Jewellery("Diamond")

    val moneyCase = Case<Money, Double>(money, 23.43)
    println(moneyCase.get())
    println(moneyCase.get2())
    moneyCase.add(Money(2308))
    println(moneyCase.get())

    val jeweleryCase = Case(jewellery, true)
    println(jeweleryCase.get())
    println(jeweleryCase.get2())
    jeweleryCase.add(Jewellery("Golden earrings"))
    println(jeweleryCase.get())

    sayHiAndPrint("John")
    sayHiAndPrint(2342)
    sayHiAndPrint(false)
    sayHiAndPrint(Case(Money(1000), "USD"))

    val case = Case("sdf", "dfs")
    println(case.get())
}

fun <T> sayHiAndPrint(item: T) {
    println("Hi $item")
}
