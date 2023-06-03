/* *
* A Set can't hold duplicate value.
* Set is an unordered collection.
* */

fun main(args: Array<String>) {
    println("How to create a Set")

    val friendSet: Set<String> = setOf("Jim", "Sue", "Nick", "Sue")
    println("$friendSet")

    for (i in friendSet) println(i)
}