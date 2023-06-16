fun main() {
    val groceries = listOf(
        Grocery("Tomatoes", "Vegetable", "lb", 3.0),
        Grocery("Mushrooms", "Vegetable", "lb", 4.0),
        Grocery("Bagels", "Bakery", "Pack", 1.5),
        Grocery("Olive oil", "Pantry", "Bottle", 6.0),
        Grocery("Ice cream", "Frozen", "Pack", 3.0),
    )

    val ints = listOf(1, 7, 3, 4, 5, 0, -1)
    val maxInt = ints.max()
    val minInt = ints.min()
    println("Maximum is $maxInt and Minimum is $minInt")

    val highestUnitPrice = groceries.maxBy { it.unitPrice }
    val lowestUnitPrice = groceries.minBy { it.unitPrice }
    println("Highest priced grocery name is: ${highestUnitPrice.name} and price is: ${highestUnitPrice.unitPrice}")
    println("Highest priced grocery name is: ${lowestUnitPrice.name} and price is: ${lowestUnitPrice.unitPrice}")
}