fun main(args: Array<String>) {
    val array1 = Array(5) { i -> (i+1)}
    array1[2] = 0
    array1.forEach { print(it) }
    println()

    val array2 = arrayOf(1, "2", 3, "4")
    array2.forEach {
        if (it is Int) {
            print(it)
        }
    }
    println()

    val array3 = arrayOf(1, "2", 3, "4",)
    array3.plus("new").forEach {
        if (it is String) {
            print(it)
        }
    }
    println()

    val array4 = arrayOf(1, "2", 3, "4")
    array4.forEachIndexed { index, data ->
        if (data is String) {
            print(index)
        }
    }
}

