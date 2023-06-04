fun main() {
    val r1 = "Chicken Soup"
    val r2 = "Quinoa Salad"
    val r3 = "Thai Curry"
    val r4 = "Jambalaya"
    val r5 = "Sausage Rolls"

    val mRecipeMap = mutableMapOf("Recipe1" to r1, "Recipe2" to r2)
    mRecipeMap.put("Recipe3", r3)
    val recipesToAdd = mapOf("Recipe4" to r4, "Recipe5" to r5)
    mRecipeMap.putAll(recipesToAdd)
    println(mRecipeMap)

    mRecipeMap.remove("Recipe2")
    println((mRecipeMap))

    val recipeToRemove = "Chicken Soup"
    mRecipeMap.remove("Recipe1", recipeToRemove)
    println(mRecipeMap)

    mRecipeMap.clear()
    println(mRecipeMap)
}