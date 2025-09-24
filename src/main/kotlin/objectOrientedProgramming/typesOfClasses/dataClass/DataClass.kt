package objectOrientedProgramming.typesOfClasses.dataClass

fun main() {
    val user = User(
        "Alex",
        "alex@alex.com",
        "qwerty123",
    )

    println(user)
}

data class User(
    val userName: String,
    val email: String,
    val password: String,
)
