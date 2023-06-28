class Node:
    def __init__(self, val=0, nxt = None):
        self.val = val
        self.next = nxt

class LinkedList:
    def __init__(self,val):
        self.head = None
        self.tail = None

    def append(self,val):
        new_node = Node(val = val)
        if self.head:
            self.tail.next = new_node
            self.tail = self.tail.next
        else:
            self.head = new_node
            self.tail = new_node

    def prepend(self,val):
        new_node = Node(val=val)
        if self.head:
            new_node.next = self.head
            self.head = new_node
        else:
            self.head = new_node
            self.tail = new_node
        
