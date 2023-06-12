class Person(val name: String, var age: Int) {
    fun sayHello() {
        println("Hello, my name is $name!")
    }
}

fun main() {
    val person = Person("Alice", 25)
    println(person.name)
    person.sayHello()
}