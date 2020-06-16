/**
* Example:
* var li = ListNode(5)
* var v = li.`val`
* Definition for singly-linked list.
*/

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun numComponents(head: ListNode?, G: IntArray): Int {
        val G_set = G.toSet()
        
        var ans = 0
        
        
        var state = false
        var p = head
        while (p != null) {
            if ( G_set.contains(p?.`val`) ) {
                if ( !state ) {
                    ans++
                    state = true
                }
            }
            else {
                state = false
            }
            p = p?.next
        }
        
        
        return ans
    }
}

fun main(args: Array<String>) {
    
}