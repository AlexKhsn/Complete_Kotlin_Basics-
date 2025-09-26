package generics.practice.library

abstract class Book(
    val title: String,
    val author: String,
    val pages: Int,
) {
    open fun displayInfo() {
        println("===Книга===")
        println(
            """
            Название: $title
            Автор: $author
            Страниц: $pages
            Длинна книга: ${isLong()}
            """.trimIndent(),
        )
    }

    fun isLong() = pages > 300
}
