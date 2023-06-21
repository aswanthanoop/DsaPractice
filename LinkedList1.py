"""Ask the user to enter
Node value and return 
the index of than particular node in given Single linked list
input : 1->2->3->4
        node : 4
        4
"""
class Node:
    def _init_(self, val=0, nxt=None):
        self.val = val
        self.next = nxt


class LinkedList:
    def _init_(self):
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

    def max(self):
        maximum = -10000000000000000
        temp = self.head
        while temp:
            if temp.val >= maximum:
                maximum = temp.val
            temp = temp.next
        return maximum

    def delete_alternate(self):
        temp = self.head
        while temp:
            if temp.next:
                temp.next = temp.next.next
            temp = temp.next

    def nth_node(self, pos):
        temp = self.head
        for i in range(pos-1):
            temp = temp.next
        return temp.val

    def return_pos(self):
        val = int(input("Enter the element to find the index of: "))
        temp = self.head
        i = 1
        while temp:
            if temp.val == val:
                return i
            i += 1

    def compare(self, l2):
        temp1 = self.head
        temp2 = l2.head
        while temp1:
            if not temp2:
                return False
            if temp2.val != temp1.val:
                return False
            temp1 = temp1.next
            temp2 = temp2.next
        if temp2:
            return False
        return True


if __name__ == "__main__":
    ll = LinkedList()
    ll.append(1)
    ll.append(2)
    ll.append(3)
    ll.prepend(5)
    ll.prepend(4)
    ll.insert(55, 2)
    ll.show()
    print(ll.nth_node(2))
    ll.delete_alternate()
    # ll.delete_start()
    # ll.delete_end()
    # ll.show()
    # ll.delete_pos(2)
    ll.show()
    print(ll.max())

    ll2 = LinkedList()
    ll2.append(4)
    ll2.append(55)
    ll2.append(2)
    ll.show()
    ll2.show()
    print(ll2.compare(ll))
