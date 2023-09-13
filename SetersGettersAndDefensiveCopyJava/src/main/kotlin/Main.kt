fun main(args: Array<String>) {

    val d = Data()
    d.add("1")
    d.add("2")
    d.copy[0] = "new"
    d.show()
}

class Data {

    private val list = mutableListOf<String>()

    val copy
        get() = listOf(list)

    fun add(x:String) = list.add(x)

    /*var i: Int = 0
        set(value) {
            if (value > 100)
                field = value
        }
        get() = Int.MAX_VALUE */

    fun show() {
        print(list)
    }
}