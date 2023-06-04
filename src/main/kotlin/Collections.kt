/**
 * MIXED MESSAGES
 * A short Kotlin program is listed below. One block of the program is
 * missing. Your challenge is to match the candidate block of code (on the
 * left), with the output that you’d see if the block were inserted. Not all the
 * lines of output will be used, and some lines of output may be used more
 * than once. Draw lines connecting the candidate blocks of code with their
 * matching output.
 */
fun main() {
    val mList = mutableListOf("Football", "Baseball", "basketball")

    mList.sort()
    println(mList)

    val mMap = mutableMapOf("0" to "Netball")
    var x = 0
    for (item in mList) {
        mMap.put(x.toString(), item)
    }
    println(mMap.values)

    mList.addAll(mList)
    mList.reverse()
    val set = mList.toSet()
    println(set)

    mList.sort()
    mList.reverse()
    println(mList)
}