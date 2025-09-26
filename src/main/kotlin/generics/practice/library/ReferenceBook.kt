package generics.practice.library

class ReferenceBook(
    title: String,
    author: String,
    pages: Int,
    val referenceType: String,
) : Book(
        title,
        author,
        pages,
    ),
    Markable,
    Searchable {
    override fun displayInfo() {
        super.displayInfo()
        println("тип справочной информации: $referenceType")
    }

    override fun bookmark(page: Int) {
        println("Добавил закладку в $referenceType $'$title' на $page странице")
    }

    override fun quickSearch(term: String) {
        println("Ищу $term в $referenceType '$title'")
    }
}
