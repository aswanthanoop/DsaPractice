package ses2;

import java.util.LinkedList;

public class mergeLinkedList {
    
        static class Node{
            int data;
            Node next;
            Node(int data){
                this.data = data;
                this.next = null;
            }
        }
        static class Linkedlist{
            Node head;
            public void insertAtEnd(int data){
                Node new_node = new Node(data);
                if(head == null){
                    new_node = head;
                }
                else{
                    Node current = head;
                    while(current.next != null){
                        current = current.next;
                    }
                    current.next = new_node;
                }
            }
            public void insertAtBeginning(int data){
                Node new_node = new Node(data);
                new_node.next = head;
                head = new_node;
            }
            public void delete(int data){
                if(head == null){
                    System.out.println("List is empty");
                    return;
                }
                if(head.data == data){
                    head = head.next;
                    return;
                }
                Node current = head;
                Node prev = null;

                while(current != null && current.data != data){
                    prev = current;
                    current = current.next;
                }
                if(current == null) System.out.println("Element not found.");
                else prev.next = current.next;

            }
            public void display(){
                if(head == null){
                    System.out.println("Linked List is Empty!");
                    return;
                }
                Node current = head;
                while(current != null){
                    System.out.println(current.data);
                    current = current.next;
                }
                System.out.println();

            }
            public static Linkedlist merge(Linkedlist l1, Linkedlist l2){
                Linkedlist mergeL = new Linkedlist();
                Node head1 = l1.head;
                Node head2  = l2.head;
                
                Node current = null;
                Node tail = null;

                if(head1.data<= head2.data){
                    current = head1;
                    head1 = head1.next;
                }
                else{
                    current = head2;
                    head2 = head2.next;
                }
                mergeL.head = current;
                tail = current;
                while(head1 != null & head2!= null){
                    if(head1.data<=head2.data){
                        current=head1;
                        head1 = head1.next;
                    }
                    else{
                        current = head2;
                        head2 = head2.next;
                    }
                    tail.next = current;
                    tail = current;

                }
                if(head1 != null){
                    tail.next = head1;
                }
                else{
                    tail.next = head2;
                }
                return mergeL;


            }

        }
        public static void main(String[] args) {
            Linkedlist list1 = new Linkedlist() ;
            Linkedlist list2 = new Linkedlist();
            list1.insertAtBeginning(1);
            list1.insertAtBeginning(1);
            list1.insertAtEnd(3);
            list1.display();
            list2.insertAtBeginning(6);
            list2.insertAtEnd(7);
            list2.insertAtEnd(8);
            list2.insertAtEnd(9);
            list2.insertAtEnd(10);
            list2.display();
      
        }
    }


    

    

