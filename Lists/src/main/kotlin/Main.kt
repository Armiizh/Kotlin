fun main(args: Array<String>) {
    val source = listOf(-4, 2, -9, 1, -8)
    print(getNewList(source, "num"))
}

fun getNewList(source: List<Int>, prefix: String) = source.filter { it>0 }.map { prefix + it }