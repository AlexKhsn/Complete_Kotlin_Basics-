package objectOrientedProgramming.typesOfClasses.dataClass.practice.practice2

fun main() {
    val articles = mutableListOf<Article>()
    articles.add(
        Article(
            "Book",
            "Something here",
            5,
        ),
    )
    articles.add(
        Article(
            "Climate",
            "It's warm",
            2,
        ),
    )

    val updatedArticle = articles[1].copy(title = "Fuck the climate!")
        .apply {
            articles.add(this)
        }

    articles.forEach { println(it) }
}
