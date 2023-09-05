fun main(args: Array<String>) {
    val list = mutableListOf(MyItem(1,"1"))
    list.addItem(MyItem(1,"1"))
    print(list)
}

fun <T> MutableList<T>.addItem(item: T) {
    if (!contains(item)) {
        add(item)
    }
}