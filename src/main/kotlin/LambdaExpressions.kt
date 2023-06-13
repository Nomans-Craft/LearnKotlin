/*fun unless(condition: Boolean, code: () -> Unit ) {
    if (!condition) {
        code()
    }
}*/

fun getConversionLambda(str: String): (Double) -> Double {
    if (str == "CentigradeToFahrenheit") {
        return {it * 1.8 + 32}
    } else if (str == "KgsToPounds") {
        return {it * 2.204623}
    } else if (str == "PoundToUSTons") {
        return { it / 2000.00 }
    } else {
        return {it}
    }
}

fun main(args: Array<String>) {
    /*val options = arrayOf("Red", "Amber", "Green")
    var crossWalk = options[(Math.random() * options.size).toInt()]
    if (crossWalk == "Green") {
        println("Walk!")
    }
    unless(crossWalk == "Green") {
        println("Stop!")
    }*/

    val pounds = getConversionLambda("KgToPounds") (2.5)


}