package stringsAndVariables

fun main(array: Array<String>) {
//    String length - кол-во символов в строке

    val myPet = "Crocodile"
    println(myPet.length)

//    Capitalize - делает первый символ заглавным

    val name = "alex"
    println(name.capitalize())

//    Decapitalize - делает первый символ строчным

    val petsName = "Dog"
    println(petsName.decapitalize())

//    Trim - убирает пробелы вначале и вконце строки

    val stringWithSpaces = "  That's a string with spaces  "
    println(stringWithSpaces.trim())

//    Get a char by position - возвращает символ по индексу

    val example = "Permission"
    println(example.get(4))
    println(example[4])

//    Get a substring - возвращает часть строки начиная с начального индекса(включительно) и заканичивая конечным(не включая его)

    println(example.substring(4))
    println(example.substring(4, 9))

//    Uppercase - Возвращает строку или символ в верхнем регистре

    println(example.uppercase())

//    Lowercase - возвращает строку или символ в нижнем регистре

    println(example.lowercase())
}
