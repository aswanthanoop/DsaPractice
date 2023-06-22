class Node:
    def __init__(self,val=0,nxt = None):
        self.val = val
        self.next = nxt

class LinkedList:
    def _init_(self):
        self.head = None
        self.tail = None

def pair_of_sum(nums,k):
    pairs = []
    for i in range (len(nums)):
        for j in range(i+1, len(nums)):
            if (nums[i]+ nums[j]) % k == 0:
                pairs.append((nums[i],nums[j]))
    return len(pairs), pairs

if __name__=="__main__":
    n,p = pair_of_sum([1,2,3,4,5],4)
    print(f"pairs :{n} \n {p}")
    


    
