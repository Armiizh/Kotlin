fun main(args: Array<String>) {
    for (i in 0..10) {
        print("$i ")
    }
    println()

    for (i in 10 downTo 0 step 2) {
        print("$i ")
    }
    println()

    val array1 = arrayOf("a", "b", "c")
    for (i in array1.indices) {
        print(array1[i])
    }
    println()

    val array2 = arrayOf("a", "b", "c")
    for (i in 0 until array2.size) {
        print(array2[i])
    }
    println()

    val array3 = arrayOf("a", "b", "c")
    for (index in array3) {
        print(index)
    }
    println()

    val array4 = arrayOf("a", "b", "c")
    for ((index, value) in array4.withIndex()) {
        print("индекс $index значение '$value' \n")
    }
    println()

    loop@ for (i in 0..2) {
        println("i: $i")
        for (j in 0..2) {
            println("j: $j")
            if (j == 1) {
                break@loop
            }
        }
    }
    println()

    doSome(2)
    println("\n")

    doSomeSome(4, arrayOf(1,2,3,4,5,6))
    println("\n")

    var x = 0
    loop1@ while (true) {
        println("main")
        loop2@ while (true) {
            println("Inner")
            if (x == 2)
                break@loop1
            x++
        }
    }

}

fun doSome(max: Int) {
    for (i in 0..max) {
        if (i == 3) return
    }
    print("Done")
}

fun doSomeSome(max: Int, array: Array<Int>) {
    array.forEach {
        if (it == max)
            return@forEach
    }
    print("WellDone")
}