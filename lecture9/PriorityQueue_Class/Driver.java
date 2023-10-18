package PriorityQueue_Class;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Driver {
    
    public static void pushElements(PriorityQueue<Integer> queue)
    {
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the queue: ");
        int size = scanner.nextInt();

        for(int i=0; i < size; i++)
        {
            System.out.println("Choose a number to push:");
            queue.add(scanner.nextInt());
        }

        scanner.close();
    }

    public static void print(PriorityQueue<Integer> queue)
    {
        System.out.println(queue);
        while(!queue.isEmpty())
        {
            System.out.println("Element " + queue.poll() + " popped");
        }

        //or 
        System.out.println(queue);

    }

    public static void main(String[] args)
    {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        pushElements(queue);
        print(queue);
    }
}
