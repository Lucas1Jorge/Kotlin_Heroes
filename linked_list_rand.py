# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    import random
    
    def __init__(self, head: ListNode):
        """
        @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node.
        """
        self.head = head

    def get_size(self):
        ans = 0
        
        p = self.head
        while(p):
            ans += 1
            p = p.next
            
        return ans
    
    def get_val_at_index(self, index):
        p = self.head
        for i in range(1, index):
            if not p: return 0
            p = p.next
            
        return p.val
    
    def getRandom(self) -> int:
        """
        Returns a random node's value.
        """
        n = self.get_size()
        index = random.randint(1, n)
        # print(n, index)
        
        return self.get_val_at_index(index)
        


# Your Solution object will be instantiated and called as such:
# obj = Solution(head)
# param_1 = obj.getRandom()