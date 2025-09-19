package objectOrientedProgramming.introduction.practice.practice14

fun main() {
    val key = Lock.createKey()
    val lock = Lock(key)
    lock.unlock(key)

    println()

    val anotherKey = Lock.createKey()
    lock.unlock(anotherKey)
}
