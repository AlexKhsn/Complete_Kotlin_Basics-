package objectOrientedProgramming.typesOfClasses.dataClass.practice.practice1

data class Customer(
    val name: String,
    val email: String,
    val products: MutableList<String>,
)
