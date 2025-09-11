package stringsAndVariables

fun main(args: Array<String>) {
    val cat = "My cat's name is \"Fluffy\""
    println(cat)

    var slashes = "Two types of slashes: \\ and /"
    println(slashes)

    var url = "http://google.com"
    println(url)

    var bunny = """
        (\(\
        (-.-)
        o_(")(")
    """

    var ears = "(\\(\\"
    var face = "(-.-)"
    var paws = "o_(\")(\")"

    println(bunny)

    println(ears)
    println(face)
    println(paws)
}
