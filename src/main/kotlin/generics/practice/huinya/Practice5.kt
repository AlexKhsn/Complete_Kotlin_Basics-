package generics.practice.huinya

fun main() {
    val stringBox = Box<String>()
    stringBox.set("Some text here")
    println(stringBox.get())

    val intBox = Box<Int>()
    intBox.set(234)
    println(intBox.get())

    val bigStringBox = BiggerBox<String, String>()
    bigStringBox.set("First string", "Second string")
    bigStringBox.get()

    val bigIntBox = BiggerBox<Int, Int>()
    bigIntBox.set(423, 54)
    bigIntBox.get()

    val stringToIntConv = FromStringToInt()
    println(stringToIntConv.convert("234"))

    val usersRepository = UserRepository()
    usersRepository.save(User("Alex", 31))
    usersRepository.save(User("Bob", 23))
    usersRepository.save(User("Jim", 54))

    val user2 = usersRepository.findById(1)
    println("User with id '1' is $user2")

    val users = usersRepository.getAll()
    println(users)
}

class Box<T> {
    private var value: T? = null

    fun get() = value

    fun set(item: T) {
        value = item
    }
}

class BiggerBox<T, S> {
    private var item1: T? = null
    private var item2: S? = null

    fun get() {
        println(item1)
        println(item2)
    }

    fun set(item1: T, item2: S) {
        this.item1 = item1
        this.item2 = item2
    }
}

interface Converter<FROM, TO> {
    fun convert(item: FROM): TO
}

class FromStringToInt : Converter<String, Int> {
    override fun convert(input: String): Int = input.toInt()
}

interface Repository<T> {
    fun save(item: T): Boolean

    fun findById(id: Int): T?

    fun getAll(): List<T>
}

class User(
    val name: String,
    val age: Int,
)

class UserRepository : Repository<User> {
    private val users = mutableListOf<User>()

    override fun save(item: User): Boolean {
        users.add(item)
        return true
    }

    override fun findById(id: Int) = users[id]

    override fun getAll(): List<User> {
        return users
    }
}
