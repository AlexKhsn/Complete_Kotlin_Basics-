package generics.practice.shop

abstract class Product(
    val id: Int,
    val name: String,
    val price: Double,
) {
    fun displayInfo() {
        println("===ТОВАР===")
        println(
            """
            ID: $id
            Название: $name
            Цена: $price$
            """.trimIndent(),
        )
        println()
    }
}
