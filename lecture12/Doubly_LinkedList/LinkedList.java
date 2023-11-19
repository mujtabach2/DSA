class Node {
    public int data;
    public Node next;
    public Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class LinkedList
{
    Node head, tail;

    LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertElement(int number)
    {
        Node node = new Node(number);

        if (this.head == null) {
            this.head = node;
            this.tail = head;
            this.head.next = null;
            this.head.prev = null;
        } else {

            Node currentNode = this.head;
            while (currentNode.next != null)
            {
                currentNode = currentNode.next;
            }
            tail = node;
            currentNode.next = tail;
            tail.prev = currentNode;
            tail.next = null;     
        }
    }
    public void printForward()
    {
        Node currentNode = this.head;
        while (currentNode != null)
        {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public void printBackward()
    {
        Node currentNode = this.tail;
        while (currentNode != null)
        {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.prev;
        }
        System.out.println();
    }
}
