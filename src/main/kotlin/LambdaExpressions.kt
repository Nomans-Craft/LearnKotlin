//Type Alias

typealias DoubleConversion = (Double) -> Double
typealias DuckArray = Array<Duck>

class Duck
fun converter(x: Double,
              converter: DoubleConversion): Double {
    val result = converter(x)
    println("$x is converted to $result")
    return result
}
fun combine(lambda1: DoubleConversion,
            lambda2: DoubleConversion): DoubleConversion {
              return {x: Double -> lambda2(lambda1(x))}
            }

fun main(args: Array<String>) {
    val kgsToPounds = {x: Double -> x * 2.204623}
    val poundsToUsTons = {x: Double -> x / 2000.0}

    val kgsToUSTons = combine(kgsToPounds, poundsToUsTons)

    val usTons = kgsToUSTons(1000.0)
}