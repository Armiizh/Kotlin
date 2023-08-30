fun main(args: Array<String>) {
    val nested = KotlinClass.NestedKotlin(5)
    nested.print()
}

class KotlinClass {

    class NestedKotlin(private val i: Int) {
        fun print() {
            print("hello from nested")
            print(i)
        }
    }
}