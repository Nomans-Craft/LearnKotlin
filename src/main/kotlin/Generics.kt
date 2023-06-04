interface Retailer<T> {
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
    val catRetailer1 = CatRetailer()
    val catRetailer2 : CatRetailer = CatRetailer()
}