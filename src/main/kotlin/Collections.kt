/**
 * POOL PUZZLE
 * Your job is to take code snippets from the pool and place them into the
 * blank lines in the code. You may not use the same code snippet more
 * than once, and you won’t need to use all the code snippets. Your goal is
 * to print the entries of a Map named glossary that provides definitions of
 * all the collection types you’ve learned about.
 * Code snippets in below:
 * "MutableArray", "MutableList", mapOf, Map, term1, term2, term3, term4, term5, term6, term7
 */
fun main() {
    val term1 = "Array"
    val term2 = "List"
    val term3 = "Map"
    val term4 = "MUtableList" //Your code here
    val term5 = "MutableMap"
    val term6 = "MutableSet"
    val term7 = "Set"

    val def1 = "Hold Values in no particular order."
    val def2 = "Holds key/value pairs."
    val def3 = "Holds values in a sequence."
    val def4 = "Can be updated."
    val def5 = "Can't be updated."
    val def6 = "Can be resized."
    val def7 = "Can't be resized."

    val glossary = mapOf(
        term4 to "$def3 $def4 $def6", //Your code here
        term7 to "$def1 $def5 $def7", //Your code here
        term1 to "$def3 $def4 $def7", //Your code here
        term5 to "$def2 $def4 $def6", //Your code here
        term2 to "$def3 $def5 $def7", //Your code here
        term6 to "$def1 $def4 $def6", //Your code here
        term3 to "$def2 $def5 $def7", //Your code here
    )

    for ((key, value) in glossary) println("$key: $value")
}