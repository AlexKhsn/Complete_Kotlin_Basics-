package generics.practice.shop

data class Customer(
    val id: Int,
    val name: String,
    val email: String,
) {
    fun printInfo() {
        println("===ПОКУПАТЕЛЬ===")
        println(
            """
            ID: $id
            Имя: $name
            Email: $email
            """.trimIndent(),
        )
        println()
    }
}
