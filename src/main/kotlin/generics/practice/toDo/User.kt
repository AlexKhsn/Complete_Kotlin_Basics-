package generics.practice.toDo

data class User(
    val name: String,
    val email: String,
    var taskCount: Int = 0,
)
