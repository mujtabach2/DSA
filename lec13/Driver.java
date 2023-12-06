class Node
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data = data;
    }
}


public class Driver
{
    
    public static int factorial(int n)
    {
        if (n<=1)
            return 1;
        else
            return n*factorial(n-1);
    }

    public static int fibonacci(int n)
    {
        if (n<=1)
            return 1;
        else
            return fibonacci(n-1)+fibonacci(n-2);
    }// time complexity: O(2^n)

    public static int power(int base, int exp)
    {
        if (exp < 0)
        {
            return 0;
        }
        if (exp==0)
            return 1;
        else
            return base*power(base, exp-1);
    }// time complexity: O(n)

    public static void print(Node head)
    {
        if (head == null)
        {
            return;
        }
        else
        {
            System.out.println(head.data);
            print(head.next);
        }
    }

    public Node removeDuplicates(Node node, int value)
    {
        if(node == null)
        {
            return null;
        }
        if(node.data == value)
        {
            return removeDuplicates(node.next, value);
        }
        else
        {
            node.next = removeDuplicates(node.next, value);
        }
         return node; 
    }
    public static void main(String[] args)
    {
        System.out.println(factorial(5));
        System.out.println(fibonacci(5));
        System.out.println(power(2, 3));

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        print(head);

    

    }
}