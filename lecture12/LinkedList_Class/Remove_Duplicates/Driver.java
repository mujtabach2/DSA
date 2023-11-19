package LinkedList_Class.Remove_Duplicates;


class Node {
    public int data;
    public Node next;
    public Node prev;


    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Driver {

    public static Node deleteDuplicates(Node head){
        Node currentNode = head;
        while (currentNode != null && currentNode.next != null)
        {
            if (currentNode.data == currentNode.next.data)
            {
                currentNode.next = currentNode.next.next;
            }
            else
            {
                currentNode = currentNode.next;
            }
        }
        return head;
    }
    
    public static void print(Node node)
    {
        while (node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(2);
        deleteDuplicates(head);
        print(head);
        
    }

}
