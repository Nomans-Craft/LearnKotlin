/* *
* A Set is immutable.
* A Set can't hold duplicate value.
* Set is an unordered collection.
* Use the contains function to check whether a Set contains a particular value.
* A Set use hash code to store its elements.
* The Set use "===" operator to compare the new value.
* Equal objects must have matching has codes.
* */

fun main() {
    println("Hash codes and equality")

    println("Equality using the === operator")
    val a = "Sue"
    val b = a
    val setA = setOf(a, b)
    println(setA)

    println("Equality using the == operator")
    val c = Recipe("Thai Curray")
    val d = Recipe("Thai Curry")
    val setB = setOf(c, d)
    println(setB)

    println("hasCode of a is: ${a.hashCode()}")
    println("hasCode of b is: ${b.hashCode()}")
    println("hasCode of c is: ${c.hashCode()}")
    println("hasCode of d is: ${d.hashCode()}")
    println("hasCode of setA is: ${setA.hashCode()}")
    println("hasCode of setB is: ${setB.hashCode()}")
}
class Recipe(name: String) {
    fun message() {
        println("Today recipe is $this")
    }
}