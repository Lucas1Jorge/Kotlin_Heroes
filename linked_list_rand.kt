/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution(head: ListNode?) {

    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
    val head = head
    
    fun get_size(head: ListNode?): Int {
        var ans = 0
        
        var p = head;
        while (p != null) {
            ans++
            p = p?.next
        }
        
        return ans
    }

    fun get_val_at_index(index: Int): Int {
        
        var p = head
        for (i in 1 until index) {
            p = p?.next
        }
        
        if (p == null)
            return 0
        
        return p.`val`
    }
    
    /** Returns a random node's value. */
    fun getRandom(): Int {
        val n = get_size(head)
        val index = (1 .. n).random()
        // println(index)
        
        return get_val_at_index(index)
    }
    
}

/**
 * Your Solution object will be instantiated and called as such:
 * var obj = Solution(head)
 * var param_1 = obj.getRandom()
 */