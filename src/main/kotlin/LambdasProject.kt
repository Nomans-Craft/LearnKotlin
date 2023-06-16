
typealias DoubleConversion1 = (Double) -> Double

fun convert(x: Double,
            converter: DoubleConversion1): Double {
    val result = converter(x)
    println("$x is converted to $result")
    return result
}

fun getConversionLambda(str: String): DoubleConversion1 {
    if (str == "CentigradeToFahrenheit") {
        return {it * 1.8 + 32}
    } else if (str == "KgsToPounds") {
        return {it * 2.204623}
    } else if (str == "PoundsToUSTons") {
        return {it / 2000.0}
    } else {
        return {it}
    }
}

fun combine1(lambda1: DoubleConversion1,
            lambda2: DoubleConversion1): DoubleConversion1 {
    return {x: Double -> lambda2(lambda1(x))}
}
fun main() {
    //Convert 2.5kg to Pounds
    println("Convert 2.5kg to Pounds: ${getConversionLambda("KigsToPounds") (2.5)}")

    //Define two conversion lambdas
    val kgsToPoundsLambda = getConversionLambda("KgsToPounds")
    val poundsToUsTonsLambda = getConversionLambda("PoundsToUsTons")

    //Combine the tow lambdas to create a new one
    val kgsToTonsLambda = combine1(kgsToPoundsLambda, poundsToUsTonsLambda)

    //Use the tow lambdas to create a new one
    val value = 17.4
    println("$value kgs is ${convert(value, kgsToTonsLambda)} US tons.")
}