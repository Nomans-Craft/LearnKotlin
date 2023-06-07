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
    println("inputed Data is: $data")
}

class MyGenericClassCons<T: Number> (val data: T) {
    fun getData(): T {
        return data
    }
}

fun <T> printIfString(value: T) where T: CharSequence {
    if (value is String) {
        println(value)
    }
}

//Multipla type constrains on a single parameter
fun <T> printIfNumber(value: T) where T: Number, T: Comparable<T> {
    if (value is Int) {
        println("Int: $value")
    } else if (value is Double) {
        println("Double: $value")
    }
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