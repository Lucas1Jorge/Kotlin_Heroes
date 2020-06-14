/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
*/
class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun get_size(head: ListNode?): Int {
    var ans = 0
    
    var p = head
    while (p != null) {
        p = p?.next
        ans++
    }
    
    return ans
}

fun LinkedList_to_ArrayList(head: ListNode?): ArrayList<Int> {
    var ans = ArrayList<Int>(get_size(head))
    
    var p = head
    while (p != null){
        ans.add(p?.`val`)
        p = p?.next
    }
    
    return ans
}

fun nextLargerNodes(head: ListNode?): IntArray {
    var n = get_size(head)
    
    var L: ArrayList<Int> = LinkedList_to_ArrayList(head)
    var ans_L = MutableList(n) {_ -> 0}
    var stack = ArrayList<Int>(n)
    
    for (i in 0 until L.size) {
        while (stack.size > 0 && L[i] > L[stack.last()]) {
            // println(stack.last())
            ans_L[stack.last()] = L[i]
            stack.removeAt(stack.size - 1)
        }
        stack.add(i)
    }
    while (stack.size > 0) {
        ans_L[stack.last()] = 0
        stack.removeAt(stack.size - 1)
    }
    // println(ans_L)
    
    return ans_L.toIntArray()
}


fun main(args: Array<String>) {
    
}