package objectOrientedProgramming.introduction.practice.practice14

import kotlin.random.Random

class Lock(key: Key) {
    val secretCode: String

    init {
        secretCode = generateSecret()
        key.secretCode = secretCode
    }

    companion object {
        fun createKey() = Key()
    }

    fun generateSecret(): String {
        return Random(System.currentTimeMillis()).nextInt().toString()
    }

    fun unlock(key: Key) {
        if (key.secretCode == secretCode) {
            println("Lock is opened")
        } else {
            println("Wrong key...")
        }
    }
}
