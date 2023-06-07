open class Animal(val name: String)

class Cat1(name: String): Animal(name)

interface AnimalShelter<out T> {
    fun getAnimal(): T
}

class CatShelter(private val cat: Cat1): AnimalShelter<Cat1> {
    override fun getAnimal(): Cat1 {
        return cat
    }
}

fun main() {
    val cat = Cat1("Whers")
    val catShelter = CatShelter(cat)
    val animalShelter: AnimalShelter<Animal> = catShelter
    val animal: Animal = animalShelter.getAnimal()
    println(animal.name)
}