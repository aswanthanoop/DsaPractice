class Node:
    def __init__(self, val=0, nxt=None):
        self.val = val
        self.next = nxt


class LinkedList:
    def __init__(self):
        self.head = None
        self.tail = None

    def append(self, val):
        new_node = Node(val=val)
        if self.head:
            self.tail.next = new_node
            self.tail = self.tail.next
        else:
            self.head = new_node
            self.tail = new_node

    def prepend(self, val):
        new_node = Node(val=val)
        if self.head:
            new_node.next = self.head
            self.head = new_node
        else:
            self.head = new_node
            self.tail = new_node

    def insert(self, val, pos):
        i = self.head
        new_node = Node(val=val)
        if pos == 0:
            self.prepend(val)
        else:
            for j in range(pos-1):
                i = i.next
            temp = i.next

            i.next = new_node
            new_node.next = temp

    def delete_start(self):
        if self.head:
            self.head = self.head.next
        else:
            print("Invalid Operation")

    def delete_end(self):
        temp = self.head
        while temp.next != self.tail:
            temp = temp.next
        temp.next = temp.next.next
        self.tail = temp

    def delete_pos(self, pos):
        i = self.head
        if pos == 0:
            self.delete_start()
        else:
            for j in range(pos - 1):
                i = i.next
            i.next = i.next.next

    def show(self):
        temp = self.head
        while temp:
            print(temp.val, end=" -> ")
            temp = temp.next
        print("None")


if __name__ == "__main__":
    ll = LinkedList()
    ll.append(1)
    ll.append(2)
    ll.append(3)
    ll.prepend(5)
    ll.prepend(4)
    ll.insert(55, 2)
    ll.show()
    ll.delete_start()
    ll.delete_end()
    ll.show()
    ll.delete_pos(2)
    ll.show()
