package objectOrientedProgramming.standartFunctions.practice.apply.practice1

class Lock {
    var secretCode = 0L

    fun unlock(key: Key) {
        if (key.secretCode == secretCode)
            println("Lock is opened")
        else
            println("Неверный ключ")
    }
}
