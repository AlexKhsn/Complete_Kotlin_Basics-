package objectOrientedProgramming.introduction.practice

fun main() {
    println(KotlinCourse.info)
    val course = KotlinCourse()
    println(course.info)
}

class KotlinCourse {
    val info = "some Kotlin info"

    companion object {
        val info = "some general info"
    }
}
