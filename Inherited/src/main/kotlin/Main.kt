fun main(args: Array<String>) {

}

interface A {
    val data: String

    fun doOne() {
        print(data)
    }
}

interface B: A {

    override val data: String

    override fun doOne() {
        super.doOne()
        println(data + data)
    }
}

class C(override val data: String) : B {

    override fun doOne() {
        super.doOne()
        print("hello from C $data")
    }
}