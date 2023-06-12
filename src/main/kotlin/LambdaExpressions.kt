fun main() {
    val addFive = {x: Int -> x + 5}
    var addSix = {x: Int -> x + 6}
    addSix = {x: Int -> x + 66}
    fun addFive(x: Int) = x + 5
    {x: Int, y: Int -> x + y}
    {"Pow!"}

    val addInts = {x: Int, y: Int -> x + y}
    val result = addInts.invoke(6, 7)

    println(result)
    println(addFive.invoke(10))

    println("Lambda's type")
    //(parameters) -> return_type
    val msg = {x: Int -> "The value is $x"}

    val add: (Int, Int) -> Int
    add = {x: Int, y: Int -> x + y}
    println(add.invoke(9, 9))

    val greeting: () -> String
    greeting = {"Hello"}
    println(greeting.invoke())
}