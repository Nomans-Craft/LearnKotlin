/**
 * Your job is to take code snippets from the pool and place them into the
 * blank lines in the code. You may not use the same code snippet more
 * than once, and you won’t need to use all the code snippets. Your goal is
 * to create a class named PetOwner that accepts generic Pet types, which
 * you must then use to create a new PetOwner<Cat> that holds references
 * to two Cat objects.
 */

class PetOwner<T: Pet>(t:T) {
    val pets = mutableListOf(t)

    fun add(t: T) {
        pets.add(t)
    }

    fun remove(t: T) {
        pets.remove(t)
    }
}
fun main() {
    val catFuzz = Cat("Fuzz Lightyear")
    val catKatsu = Cat("Katsu")
    val fishFinny = Cat("Finny McGraw")
    val catOwner = PetOwner(catFuzz)
    catOwner.add(catKatsu)
}