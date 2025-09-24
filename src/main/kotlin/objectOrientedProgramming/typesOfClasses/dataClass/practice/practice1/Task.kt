package objectOrientedProgramming.typesOfClasses.dataClass.practice.practice1

fun main() {
    val customer1 = Customer(
        "Alex",
        "alex@alex.com",
        mutableListOf("laptop", "phone"),
    )

    val customer2 = Customer(
        "Bob",
        "bob@bob.com",
        mutableListOf("bike", "phone", "table", "cup"),
    )

    val customer3 = Customer(
        "Den",
        "den@den.com",
        mutableListOf("monitor", "socks", "tablet", "gun"),
    )

    val customers = mutableListOf(customer1, customer2, customer3)

    val customer2Upd = customer2.copy(email = "bobby@loh.com")
    customers[1] = customer2Upd

    fun sendEmail() {
        customers.forEach {
            println("Message for ${it.email} was sent")
        }
    }

    sendEmail()
}
