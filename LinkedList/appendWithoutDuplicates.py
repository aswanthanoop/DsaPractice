class Node(self, val=0, nxt=None):
    self.val = Val
    self.next = nxt

class LinkedList:
    def __init__(self,val):``
        self.head = None
        self.tail = None

    def append_without_duplicates(self, lst):
        added = set()
        for i in lst:
            if i in added:
                continue
            else:
                self.append(i)
                added.add(i)

if "__name__" == "__main__":
    print(append_without_duplicates([1,2,3,4,5,6,77,77,77,8])
    )
    



