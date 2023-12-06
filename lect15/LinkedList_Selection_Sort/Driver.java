package LinkedList_Selection_Sort;
class Node
{
    int value;
    Node next;

    public Node(int value)
    {
        this.value = value;
        this.next = null;
    }
}
public class Driver {
    public static void selectionSort(Node Head)
    {
        Node curr = Head;

        // start from the first element
        while(curr != null)
        {
            // make the current element as the minimum element
            Node min = curr;
            Node temp = curr.next;
            // make the temp variable point to the next element
            // compare the current element with all the elements after it
            while(temp != null)
            {
                // if the element is smaller than the current element
                // make it the minimum element
                if(temp.value < min.value)
                {
                    min = temp;
                }
                temp = temp.next;
            }
            // swap the current element with the minimum element
            int tempValue = curr.value;
            curr.value = min.value;
            min.value = tempValue;
            curr = curr.next;
        }

    }

    public static void printList(Node head)
    {
        Node currentNode = head;
        while (currentNode != null) 
        {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(5);
        head.next = new Node(1);
        head.next.next = new Node(7);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);

        printList(head);
        System.out.println();
        selectionSort(head);
        printList(head);
        
    }
}
