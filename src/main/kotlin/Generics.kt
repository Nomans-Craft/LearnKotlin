abstract class Pet(var name: String)

class Cat(name: String) : Pet(name)
class Dog(name: String) : Pet(name)
class Fish(name: String) : Pet(name)

interface Retailer<out T> {
    fun sell(): T
}

class CatRetailer : Retailer<Cat> {
    override fun sell(): Cat {
        println("Sell cat")
        return Cat("")
    }
}

class DogRetailer : Retailer<Dog> {
    override fun sell(): Dog {
        println("Sell dog")
        return Dog("")
    }
}

fun main() {
    val dogRetailer: Retailer<Dog> = DogRetailer()
    val catRetailer: Retailer<Cat> = CatRetailer()
    val petRetailer: Retailer<Pet> = CatRetailer()

    val catList: List<Cat> = listOf(Cat(""), Cat(""))
    val petList: List<Pet> = catList
}