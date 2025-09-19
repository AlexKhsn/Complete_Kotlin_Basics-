package objectOrientedProgramming.introduction.practice

import kotlin.random.Random

//
// import kotlin.random.Random
//
// fun main() {
//    val correctKey = Lock.createKey()
//    val lock = Lock(correctKey)
//    lock.unlock(correctKey)
//
//    val randomKey = Lock.createKey()
//    lock.unlock(randomKey)
// }
//
//
// class Lock(key: Key) {
//    val secretCode: String
//    init {
//        secretCode = generateSecret()
//        key.secretCode = secretCode
//    }
//
//    companion object {
//        fun createKey() = Key()
//    }
//
//    fun generateSecret(): String {
//        return Random(System.currentTimeMillis()).nextInt().toString()
//    }
//
//    fun unlock(key: Key) {
//        if(key.secretCode == secretCode) {
//            println("Lock is opened")
//        } else {
//            println("Key is not correct")
//        }
//    }
// }
//
// class Key {
//    var secretCode = ""
//        set(value) {
//            if(field == "") field = value
//        }
// }

// fun main() {
//    val correctKey = Lock.createKey()
//    val lock = Lock(correctKey)
//    lock.unlock(correctKey)
//    println()
//    val randomKey = Lock.createKey()
//    lock.unlock(randomKey)
// }
//
// class Lock(key: Key) {
//    val secretCode: String
//    init {
//        secretCode = generateSecret()
//        key.secretCode = secretCode
//    }
//
//    companion object {
//        fun createKey() = Key()
//    }
//
//    fun generateSecret(): String {
//        return Random(System.currentTimeMillis()).nextInt().toString()
//    }
//
//    fun unlock(key: Key) {
//        if(key.secretCode == secretCode) {
//            println("Lock is opened")
//        } else {
//            println("Wrong key")
//        }
//    }
// }
//
// class Key {
//    var secretCode = ""
//        set(value) {
//            if (field == "") field = value
//        }
// }

fun main() {
    val key = Lock.createKey()
    val lock = Lock(key)
    lock.unlock(key)

    println()

    val anotherKey = Lock.createKey()
    lock.unlock(anotherKey)
}

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

class Key {
    var secretCode = ""
        set(value) {
            if (field == "") field = value
        }
}
