class Node:
    def __init__(self,val=0,nxt = None):
        self.val = val
        self.next = nxt

class LinkedList:
    def _init_(self):
        self.head = None
        self.tail = None
    def append(self, val):
        new_node = Node(val = val)
        if self.head:
            self.tail.next = new_node
            self.tail = self.tail.next
        else:
            self.head = new_node
            self.tail = new_node


def pair_of_sum(nums,k):
    pairs = []
    for i in range (len(nums)):
        for j in range(i+1, len(nums)):
            if (nums[i]+ nums[j]) % k == 0:
                pairs.append((nums[i],nums[j]))
    return len(pairs), pairs

if __name__=="__main__":
    n,p = pair_of_sum([2,2,17,5,3],5)
    print(f"pairs :{n} \n {p}")



    
