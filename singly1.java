public class singly1 {
    class Node {
        int data;
        Node next;
    
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public class LinkedList {
        Node head;
    
        // Function to reverse the linked list
        public Node reverse(Node head) {
            Node prev = null;
            Node current = head;
            Node next = null;
    
            while (current != null) {
                next = current.next; // Store the next node
                current.next = prev; // Reverse the current node's pointer
                prev = current;      // Move the prev pointer forward
                current = next;      // Move to the next node
            }
            
            head = prev; // Set the new head to the last non-null node
            return head;
        }
    
        // Function to print the linked list
        public void display(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    
        public static void main(String[] args) {
            singly1 list = new singly1();
            list.head = new Node(1);
            list.head.next = new Node(2);
            list.head.next.next = new Node(3);
            list.head.next.next.next = new Node(4);
            list.head.next.next.next.next = new Node(5);
    
            System.out.println("Original List:");
            list.display(list.head);
    
            list.head = list.reverse(list.head);
    
            System.out.println("Reversed List:");
            list.display(list.head);
        }
    }
    
    
}
