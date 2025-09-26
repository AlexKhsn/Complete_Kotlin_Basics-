package generics.practice.library

class FictionBook(
    title: String,
    author: String,
    pages: Int,
    val genre: String,
) : Book(
        title,
        author,
        pages,
    ),
    Recommendable,
    Ratable {
    override fun displayInfo() {
        super.displayInfo()
        println("Жанр: $genre")
    }

    override fun recommend() {
        println("Рекомендую художественную книгу $title")
    }

    override fun rate(rating: Int) {
        println("Оцениваю художественную книгу $title на $rating")
    }
}
