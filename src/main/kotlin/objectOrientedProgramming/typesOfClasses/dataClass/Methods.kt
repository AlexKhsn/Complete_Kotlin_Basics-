package objectOrientedProgramming.typesOfClasses.dataClass

fun main() {
    val regularUser1 = RegularUser(
        "Alex",
        "alex@alex.com",
        "qwerty123",
    )

    val regularUser2 = RegularUser(
        "Alex",
        "alex@alex.com",
        "qwerty123",
    )

    println(regularUser1 == regularUser2)

    println(regularUser1.toString())

    val dataUser1 = DataUser(
        "Alex",
        "alex@alex.com",
        "qwerty123",
        25,
    )

    val dataUser2 = DataUser(
        "Alex",
        "alex@alex.com",
        "qwerty123",
        26,
    )

    println(dataUser1 == dataUser2)
    println(dataUser1.equals(dataUser2))
    println(dataUser1.toString())

    val dataUser3 = dataUser1.copy(email = "john@john.com")
    println(dataUser3.toString())
    println(dataUser1.hashCode())
}

class RegularUser(
    val userName: String,
    val email: String,
    val password: String,
)

data class DataUser(
    val userName: String,
    val email: String,
    val password: String,
    val age: Int,
)

/**
 *  Data classes имеют следующий набор методов:
 *
 *  1)  .equals() или '==' - сравнивает два дата класса и  возвращает true/false
 *  2)  .copy() - делает копию дата класса и возвращает ее
 *  3)  .toString() - возращает строку содержащую свойства со значениями, которые есть в дата классе
 *  4)  componentN() функции (деструктуризация) - есть возможность деструктуризировать объект и получить переменные со значениями из объекта
 */
