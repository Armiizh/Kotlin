import java.lang.IllegalArgumentException

fun main(args: Array<String>) {
    println(max(1, 5))
    checkNumber1(5)
    checkNumber2(0)
    convertGrade(3)
    checkNumber3(-77)
    check(2)
    check("Artemii")
    check(true)
}

fun max(a: Int, b: Int) = if (a > b) a else b

fun checkNumber1(x: Int) {
    if (x > 0) {
        println("Positive")
    } else if (x < 0) {
        println("Negative")
    } else {
        println("Zero")
    }
}

fun checkNumber2(x: Int) {
    when {
        x > 0 -> println("Positive")
        x < 0 -> println("Negative")
        else -> println("Zero")
    }
}

fun convertGrade(grade: Int) {
    when (grade) {
        5 -> println("A")
        4 -> println("B")
        3 -> println("C")
        2 -> println("D")
        1,6 -> println("E")
        else -> throw IllegalArgumentException("Unknown grade")
    }
}

fun checkNumber3(x: Int) {
    when (x) {
        in 1..100 -> println("Positive")
        in -100..-1 -> println("Negative")
        else -> println("Zero")
    }
}

fun check(x: Any) {
    when (x) {
        is String -> println(x.isEmpty())
        is Int -> println(x+1)
        else -> println("Unknown type")
    }
}