package LinkedList;



class Node{
    String city;
    Node next;
    Node(String city)
    {
        this.city = city;
        this.next = null;
    }

}
public class Driver {
    public static Node removeCitiesWithO(Node head)
    {
    // Fill in this function
        while(head!=null && head.city.contains("O") || head.city.contains("o"))
        {
            head=head.next;
        }
        Node temp=head;
        while(temp!=null && temp.next!=null)
        {
            if(temp.next.city.contains("O") || temp.next.city.contains("o"))
            {
                temp.next=temp.next.next;
            }
            else
            {
                temp=temp.next;
            }
        }
        return head;

    }
    public static void printList(Node head)
    {

        while(head!=null)
        {
            System.out.print(head.city+" ");
            head=head.next;
        }
        System.out.println();
    // Fill in this function
    }
    public static void main(String[] args)
    {
        Node head = new Node("Toronto");
        head.next = new Node("Oshawa");
        head.next.next = new Node("Ajax");
        head.next.next.next = new Node("Whitby");
        head.next.next.next.next = new Node("Markham");
        System.out.println("\nOriginal Linked List...");
        printList(head);
        System.out.println("\n\nModified Linked List...");
        printList(removeCitiesWithO(head));
    }
}