fun main(args: Array<String>) {

    val a = A()
    a.doAny(true)
    a.doAny(true)
}

class A {

    private val b by lazy {
        B()
    }

    fun doAny(flag: Boolean = false) {
        if (flag) {
            b.doSome()
        }
    }
}

class B {

    fun doSome() {
        println("call b")
    }
}