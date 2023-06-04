fun main() {
    println("Copy a MutableSet")

    val friendSet = mutableSetOf("Jim", "Sue", "Noman")
    val mFriendSet = friendSet.toMutableSet()
    val friendList = friendSet.toList()
    val mFriendList = friendList.toMutableList()

    println("$friendSet")
    println("$mFriendSet")
    println("$friendList")
    println("$mFriendList")
}
