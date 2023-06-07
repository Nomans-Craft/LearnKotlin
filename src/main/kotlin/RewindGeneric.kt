class MyGenericClass<T> (val data: T) {
    @JvmName("getDataJvm")
    fun getData(): T {
        return data
    }
}

interface MyGenericInterface<T> {
    fun doSomething(data: T)
}

fun <T> printData(data: T) {
    println("Data: $data")
}

fun main() {
    val myStringClass = MyGenericClass("Hello, world")
    val myIntClass = MyGenericClass(42)
    println(myStringClass.getData())
    println(myIntClass.getData())

    class MyGenericImpl : MyGenericInterface<String> {
        override fun doSomething(data: String) {
            println("Doing Something with String data: $data")
        }
    }
    val myGenericImpl = MyGenericImpl()
    myGenericImpl.doSomething("Hello, world")
    printData("Hello, world")
    printData(5)
}