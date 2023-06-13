fun main(args: Array<String>) {
    fun convert(x: Double,
               converter: (Double) -> Double): Double {
        val result = converter(x)
        println("$x is converted to $result")
        return result
    }
    val fahrenheit = convert(20.0, {c: Double -> c * 1.8 + 32})

    convert(20.0) { c: Double -> c * 1.8 + 32 }

    fun convertFive(converter: (Int) -> Double): Double {
        val result = converter(5)
        println("5 is coverted to $result")
        return result
    }
    convertFive {it * 1.8 + 32}
}