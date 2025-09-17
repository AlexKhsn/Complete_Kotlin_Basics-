package functions.functionsContinued

fun main() {
    listAnimals()
    // listOneAnimal("Dog")                      - ОШИБКА! listOneAnimal() не доступна вне внешней
    //                                            функции
}

fun listAnimals() {
    fun listOneAnimal(animal: String) {
        println("I have $animal")
    }

    val myAnimals = listOf("Cat", "Dog", "Parrot", "Bear")
    for (animal in myAnimals) {
        listOneAnimal(animal)
    }
}

/**
 *  Local function - объявляется внутри другой функции и доступна только в пределах внешней функции,
 *  но не за ее пределами.
 *      - Используется если функция должна быть использована только в ходе выполнения другой - внешней
 *        функции, но снаружи не используется
 *      - Скрывает детали реализации от внешнего кода
 *      - Ограничивает область видимости
 *      - Предотвращают случайное использование извне
 *  Является механизмом организации и структурирования кода
 */
