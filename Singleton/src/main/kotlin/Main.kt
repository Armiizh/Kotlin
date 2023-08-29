fun main(args: Array<String>) {
    Singleton.increment()
    Singleton.increment()
    Singleton.print()
}

object Singleton {

    private var x = 0

    fun increment() {
        x++
    }

    fun print() {
        print(x)
    }
}