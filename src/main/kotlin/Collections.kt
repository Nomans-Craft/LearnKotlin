/*
* EXERCISE: SHARPEN YOUR PENCIL
* Four friends have each made a List of their pets. One item in the List
* represents one pet. Here are the four lists.
* val petsLiam = listOf("Cat", "Dog", "Fish", "Fish")
* val petsSophia = listOf("Cat", "Owl")
* val petsNoah = listOf("Dog", "Dove", "Dog", "Dove")
* val petsEmily = listOf("Hedgehog")
* Write the code to print how many types of pet there are.
 */
fun main() {
    val petsLiam = listOf("Cat", "Dog", "Fish", "Fish")
    val petsSophia = listOf("Cat", "Owl")
    val petsNoah = listOf("Dog", "Dove", "Dog", "Dove")
    val petsEmily = listOf("Hedgehog")

    val pets: MutableList<String> = mutableListOf()
    pets.addAll(petsLiam)
    pets.addAll(petsSophia)
    pets.addAll(petsNoah)
    pets.addAll(petsEmily)
    pets.size

    val petSet = pets.toMutableSet()
    println(petSet.size)

    val petList = petSet.toMutableList()
    petList.sort()
    println(petList)
}
