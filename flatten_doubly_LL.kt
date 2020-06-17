class Node(var `val`: Int) {
    var prev: Node? = null
    var next: Node? = null
    var child: Node? = null
}

fun print_list(root: Node?) {
    
    var p = root
    while (p != null) {
        print(String.format("prev: %d, curr: %d, next: %d\n", p.prev?.`val`, p.`val`, p.next?.`val`))
        
        p = p.next
    }
}

fun get_tail(root: Node?): Node? {
    if (root == null)
        return null
    
    var p = root
    while (p?.next != null) {
        // print(String.format("get_tail: %d\n", p.`val`))
        p = p.next
    }
    
    return p
}

fun flatten(root: Node?): Node? {
    var p = root
    
    while (p != null) {
        if (p.child == null)
            p = p.next
        else {
            // print(String.format("flatten: %d\n", p.`val`))
            flatten(p.child)
            
            var tail = get_tail(p.child)
            
            tail?.next = p.next
            tail?.next?.prev = tail
            
            p.next = p.child
            p.next?.prev = p
            
            p.child = null
            p = tail?.next
        }
    }
    
    // print_list(root)
    
    return root
}

fun main(args: Array<String>) {
    println("function to flatten a multilevel doubly linked list")
}