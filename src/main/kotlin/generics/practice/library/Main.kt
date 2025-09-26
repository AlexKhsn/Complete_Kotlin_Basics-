package generics.practice.library

fun main() {
    val book1 = FictionBook(
        "Harry Potter",
        "J.K.Rowling",
        654,
        "Fantasy",
    )

    val book2 = TextBook(
        "How to count",
        "Lomonosov",
        1234,
        "Math",
    )

    val book3 = ReferenceBook(
        "English - it's simple",
        "unknown",
        39,
        "Vocabulary",
    )

    println(findLongBooks(listOf(book1, book2, book3)))
    println(findByAuthor(listOf(book1, book2, book3), "Lomonosov"))

    recommendAllFiction(listOf(book1))
    studyAllTextbooks(listOf(book2))
    bookmarkAllReferences(listOf(book3))

    println()

    fun Book.logging() {
        println("Создана книга: $title")
    }

    FictionBook(
        "War and Peace",
        "Tolstoy",
        3546,
        "Roman",
    ).apply {
        displayInfo()
        recommend()
        rate(10)
        logging()
    }

    TextBook(
        "Easy to cook",
        "unknown",
        324,
        "Chemistry",
    ).apply {
        displayInfo()
        study()
        makeNote("Don't forget!")
        logging()
    }

    listOf(book1, book2, book3).apply {
        findLongBooks(this)
    }
}

fun findLongBooks(books: List<Book>): List<Book> {
    return books.filter { it.isLong() }
}

fun findByAuthor(books: List<Book>, author: String): List<Book> {
    return books.filter { it.author == author }
}

fun recommendAllFiction(books: List<Recommendable>) {
    books.forEach { it.recommend() }
}

fun studyAllTextbooks(books: List<Studiable>) {
    books.forEach { it.study() }
}

fun bookmarkAllReferences(books: List<Markable>) {
    books.forEach { it.bookmark(5) }
}
