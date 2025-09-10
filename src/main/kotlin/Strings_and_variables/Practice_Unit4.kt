package org.example.Strings_and_variables


// Task 1

/*

const val CITY: String = "Gliwice"

fun main(args: Array<String>) {
    val name: String = "Alex"
    val age: Int = 31
    val greeting: String = "Привет! Меня зовут $name, мне $age лет, я живу в городе $CITY"

    println(greeting)
    println(greeting.length)

}

*/


// Task 2

/*

fun main(array: Array<String>) {
    val sentence = "I am an example sentence."

    println(sentence)
    println(sentence.uppercase())
    println(sentence.lowercase())
    println(sentence.length)
    println(sentence.substring(0,3))
    println(sentence.takeLast(4))
}


*/

//  Task 3

/*

fun main(args: Array<String>) {
    val fullName: String = "Alexander Khomishyn"
    val dividedFullName = fullName.split(" ")
    val name = dividedFullName[0]
    val surname = dividedFullName[1]


    println("Ваше имя: $name")
    println("Ваша фамилия: $surname")
    println(fullName.lowercase().contains('a'))
}

 */

//  Task 4

/*

fun main(args: Array<String>) {
    val email: String = "myemail@gmail.com"

    println(email[0].isUpperCase())
    println(email.endsWith(".com"))
    println(email.replace("@", "[at]"))
    println(email.reversed())
}

 */

//  Task 5

/*

const val BOOK: String = "Гарри Поттер"

fun main(args: Array<String>) {
    val author: String = "J.K.Rowling"
    val introducing: String = "Книга $BOOK написана автором $author"
    val counter: Int = introducing.lowercase().filter {it =='а'}.length

    println(introducing)
    println("Буква 'a' встречается $counter раз")
    println(introducing.substring(0, 10) + "...")
}

 */