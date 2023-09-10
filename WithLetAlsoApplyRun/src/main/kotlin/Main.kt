fun main(args: Array<String>) {
    with(AImpl()) {
        do1()
        do2()
    }

    AImpl().let { a ->
        a.do2()
        B().doSome(a)
    }

    fun getA(): A = AImpl().also {
        it.do2()
        B().doSome(it)
    }

    fun getList() = ArrayList<String>().apply {
        add("1")
        add("2")
    }

    val a: A? = null
    with(a) {
        a?.do1()
        a?.do2()
    }

    a?.run {
        do1()
        do2()
    }

}

class AImpl : A

interface A {

    fun do1() {
        println("1")
    }

    fun do2() {
        println("2")
    }
}

class B {

    fun doSome(a: A) {
        println("some")
        a.do1()
    }
}