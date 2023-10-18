

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;

    }
}
public class LinkedList{
    Node head;

    LinkedList(){
        this.head = null;
    }
    public void insertElement(int number)
    {
        Node node = new Node(number);

        if(this.head == null)
        {
            this.head = node;
        }
        else{
            Node currNode = this.head;

            while(currNode.next != null)
            {
                currNode = currNode.next;
            }
            currNode.next = node;

        }
    }
    public void print()
    {
        Node currNode = this.head;

        while(currNode != null)
        {
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
    }

    public Boolean search(int number)
    {
        Boolean found = false;

        Node currentNode = this.head;

        while (currentNode != null)
        {
            if (currentNode.data == number)
            {
                found = true;
                break;
            }
            currentNode = currentNode.next;
        }

        return found;
    }

    public void delete(int number)
    {
        Node currNode = this.head;
        Node prevNode = this.head;

        if(this.head == null)
        {
            System.out.println("List is empty");
        }

        if(head.data == number)
        {
            this.head = this.head.next;
        }

        while(currNode != null)
        {
            if (currNode.data != number)
            {
                prevNode = currNode;
                currNode = currNode.next;
            }
            else
            {
                prevNode.next = currNode.next;
                currNode = null;
            }
        }
    }

}


