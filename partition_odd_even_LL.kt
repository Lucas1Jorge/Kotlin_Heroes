/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
**/

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun oddEvenList(head: ListNode?): ListNode? {
    val e_head = head
    val o_head = head?.next
     
    var e_p = e_head
    var e_tail = e_p
    var o_p = o_head
    
    while (true) {
        if (e_p == null)
            break
        e_tail = e_p
        if ( e_p?.next == null )
            break
        e_p.next = e_p.next?.next
        e_p = e_p.next
        
        if ( o_p?.next == null )
            break
        o_p.next = o_p.next?.next
        o_p = o_p.next
    }
    
    e_tail?.next = o_head
    
    return e_head
}

fun main(args: Array<String>) {
    println("Here")
}