package Stack_Class;

import java.util.Scanner;
import java.util.Stack;

public class Driver {
    public static void pushElements(Stack<Integer> stack)
    {
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the stack: ");
        int size = scanner.nextInt();

        for(int i=0; i < size; i++)
        {
            System.out.println("Choose a number to push:");
            stack.push(scanner.nextInt());
        }

        scanner.close();
    }

    public static void popElements(Stack<Integer> stack)
    {
        while(!stack.isEmpty())
        {
            System.out.println("Element " + stack.pop() + " popped");
        }

    }

    public static void searchElement(Stack<Integer> stack, int number)
    {
        int pos = stack.search(number);

        if(pos == -1)
        {
            System.out.println("Number nor found");
        }
        else
        {
            System.out.println("Found at postion " + pos);
        }
    }

    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<>();
        pushElements(stack);
        searchElement(stack, 5);
        popElements(stack);
    }
}
