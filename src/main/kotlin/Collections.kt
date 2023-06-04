fun main() {
    println("How to use a MutableSet")

    val mFriendSet = mutableSetOf("Jim", "Sue")
    mFriendSet.add("Nick")
    println("${mFriendSet.add("Sue")}")//Duplicate value return "false"
    mFriendSet.remove("Jim")
    println("$mFriendSet")

    val toAdd = setOf("Joe", "Mia")
    mFriendSet.addAll(toAdd)
    println(mFriendSet)

    val toRemove = setOf("Mia")
    mFriendSet.removeAll(toRemove)
    println(mFriendSet)

    val toRetain = setOf("Sue", "Nick")
    mFriendSet.retainAll(toRetain)
    println(mFriendSet)

    mFriendSet.clear()
    println(mFriendSet)
}
