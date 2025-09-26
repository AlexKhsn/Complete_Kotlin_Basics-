package generics.practice.toDo

abstract class Notification(
    val title: String,
    var message: String,
    val timeStamp: String,
) {
    abstract fun formatMessage(): String

    abstract fun send()
}
