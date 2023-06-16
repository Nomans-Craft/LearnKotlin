/*
* Create the Groceries project
* */

data class Grocery2(
    val name: String,
    val category: String,
    val unit: String,
    val unitPrice: Double,
    val quantity: Int,
)

fun main() {
    val groceries = listOf(
        Grocery2("Tomatoes", "Vegetable", "lb", 3.0, 3),
        Grocery2("Mushrooms", "Vegetable", "lb", 4.0, 1),
        Grocery2("Bagels", "Bakery", "Pack", 1.5, 2),
        Grocery2("Olive oil", "Pantry", "Bottle", 6.0, 1),
        Grocery2("Ice cream", "Frozen", "Pack", 3.0, 2),
    )

    val highestUnitPrice = groceries.maxBy { it.unitPrice * 5 }
    println("highestUnitPrice: $highestUnitPrice")

    val lowestQuantity = groceries.minBy { it.quantity }
    println("lowestQuantity: $lowestQuantity")

    val sumQuantity = groceries.sumBy { it.quantity }
    println("sumQuantity: $sumQuantity")

    val totalPrice = groceries.sumByDouble { it.quantity * it.unitPrice }
    println("totalPrice: $totalPrice")
}