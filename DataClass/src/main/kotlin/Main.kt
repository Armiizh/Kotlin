fun main(args: Array<String>) {

    val map = HashMap<MyItem, Int>()

    val size = 2000000

    var hashcodeCalls = 0
    var equalsCalls = 0

    val callback = object: MyCallback {
        override fun hashCodeCallde() {
            hashcodeCalls++
            if (hashcodeCalls %1000 == 0)
                println("hashcodecalls $hashcodeCalls")
        }

        override fun equalsCalled() {
            equalsCalls++
            println("equalscalls $equalsCalls")
        }
    }
    for (i in 0 until size) {
        map[MyItem(i,"$i",callback)] = i
    }
    print("hashcodes $hashcodeCalls equals $equalsCalls")
}