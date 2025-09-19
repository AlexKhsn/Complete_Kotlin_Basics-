package objectOrientedProgramming.introduction

fun main() {
    DatabaseAccess.connected = true
    if (DatabaseAccess.connected) DatabaseAccess.disconnect()
    else DatabaseAccess.connect()

    println("Database is connected: ${DatabaseAccess.connected}")
}

object DatabaseAccess {
    var connected = false

    fun connect() {
        connected = true
        println("Connected to the database")
    }

    fun disconnect() {
        connected = false
        println("Disconnected from the database")
    }
}

/**
 *  При создании объекта с помощью ключевого слова 'object' - создается singleton
 *  При создании инстанса класса - так же создается объект.
 *  Отличие заключается в том что для доступа к свойствам и методам класса необходимо
 *  создавать инстанс - объект, а для доступа к свойствам и методам объекта ('object') не
 *  нужно. Мы получаем их обращаясь к самому объекту
 */
