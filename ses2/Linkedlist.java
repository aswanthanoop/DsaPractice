package ses2;

public class Linkedlist {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
        
    }
    static class LinkedList{
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
                current.next =new_node;
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
                return ;
            }
            Node current = head;
            Node prev = null;

            while( current != null && current.data != data){
                prev = current;
                current = current.next;

            }
            if(current == null) System.out.println("Eleent not found .");
            else prev.next = current.next;

        }
        public void display(){
            if(head==null){
                System.out.println("List is Empty.");
                return;
            }
            Node current = head;
            while(current!= null){
                System.out.println(current.data);
                current = current.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtBeginning(1);
        list.insertAtBeginning(3);
        list.insertAtEnd(5);
        list.display();

    }
    
}
