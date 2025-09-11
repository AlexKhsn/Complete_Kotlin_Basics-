package nullability

fun main(Args: Array<String>) {
    var catName: String? = "Cat"
    catName = null
    println(catName)

    var dogName = "Dog"
//    dogName = null                -------- ОШИБКА! Не указан оператор "?"

    val catNameLength = catName?.length
    println(catNameLength)

    //    val catNameLength2 = catName.length       --------    ОШИБКА! Что бы получить длинну nullable строки, нужно использовать оператор "?."
    //    Если переменная содержит null, "?." вернет null, если нет - вернет значение

    // Можно использовать оператор "?." для цепочки действий
    println()

    var age: String? = "20"
    println(age?.length?.toString())

    age = null
    println(age?.length?.toString())
}
