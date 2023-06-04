fun main() {
    val r1 = "Chicken Soup"
    val r2 = "Quinoa Salad"
    val r3 = "Thai Curry"

    val recipeMap = mapOf("Recipe1" to r1, "Recipe2" to r2, "Recipe3" to r3)
    println(recipeMap)

    println(recipeMap.containsKey("Recipe1"))

    val recipeToCheck = "Chicken Soup"
    if (recipeMap.containsValue(recipeToCheck)) {
        println("recipeMap contains a recipe for Chicken Soup.")
    }

    if (recipeMap.containsKey("Recipe1")) {
        val recipe = recipeMap.getValue("Recipe1")
        println(recipe)
    }

    for ((key, value) in recipeMap) {
        println("Key is $key, value is $value")
    }
}