class Node:
    def __init__(self, val = 0,nxt = None):
        self.val = val
        self.next = nxt

class LinkedList:
    def __init__(self):
        self.head = None
        self.tail = None
        self.length = 0
    def append(self, val):
        new_node = Node(val = val)
        if self.head:
            self.tail.next = new_node
            self.tail = self.tail.next
        else:
            self.head = new_node
            self.tail = new_node
    def show(self):
        temp = self.head
        while temp:
            print(temp.val, end=" -> ")
            temp = temp.next
        print("None")


    def remove_the_nth_element(self,n):
        temp = self.head
        if self.length == 0 or self.length >n:
            print("UnderFlow")
        elif n == 0:
            self.delete_end()
        elif n ==self.length:
            self.delete_start()
        else:
            for i in range(self, length - n - 1 ):
                temp = temp.next
            temp.next = temp.next.next
        self.length -= 1

    def pairwise_swap(self):
        l = self.head
        r = self.head.next
        l.next = r.next
        r.next = l
        self.head = r
        temp = l
        l = l.next
        r = l.next
        while l and r:
            temp.next = r
            l.next = r.next
            r.next = l
            temp = l
            if l.next and r.next:
                l = l.next
                r = l.next
            else:
                break    
            
        


if __name__ == "__main__":
    ll = LinkedList()
    ll.append(4)
    ll.append(5)
    ll.append(6)
    ll.append(7)
    ll.append(8)
    ll.append(9)
    ll.append(4)
    ll.append(5)
    ll.append(6)
    ll.append(7)
    ll.append(8)
    ll.append(9)
    ll.show()
    ll.remove_the_nth_element(3)
    ll.show()

