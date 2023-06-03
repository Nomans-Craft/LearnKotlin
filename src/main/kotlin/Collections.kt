/* *
* A Set is immutable.
* A Set can't hold duplicate value.
* Set is an unordered collection.
* Use the contains function to check whether a Set contains a particular value.
* */

fun main() {
    println("How to use a Set's value")

    val friendSet: Set<String> = setOf("Jim", "Sue", "Nick", "Sue")
    println("$friendSet")

    val isFredGoing = friendSet.contains("Fred")
    println(isFredGoing)

    for (item in friendSet) println(item)
}