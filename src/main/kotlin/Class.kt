open class Person(val name: String, var age: Int) {
    fun sayHello() {
        println("Hello, my name is $name!")
    }
}

class Student(name: String, age: Int, val studentId: Int): Person(name, age) {
    fun study() {
        println("$name is studying!")
    }
}

fun main() {
    val person = Person("Noman", 35)
    println(person.name)
    person.sayHello()
    val student = Student("Lenin", 36, 1001)
    println(student.studentId)
    student.sayHello()
    student.study()
}