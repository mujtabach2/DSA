import java.util.Scanner;

public class Driver{
    public static void main(String[] args)
    {
        int[] numbers = {1, 2, 3, 4, 5};
        display(numbers);
        changeReference(numbers);
        display(numbers);
        modify(numbers);
        display(numbers);


        Scanner scanner = new Scanner(System.in);
        System.out.print("How many elements do you want to enter: ");
        int size = scanner.nextInt();

        int[] numbers1 = new int[size];
        getElements(numbers1);
        scanner.close();
        display(numbers1);
    }

    // arrays can be passed to functions 
    public static void display(int[] numbers)
    {   
        //variation of for loop 
        for (int items: numbers)
        {
            System.out.println(items);
        }

        System.out.println();
        // time complexity linear time O(n)
    }

     // When an array is passed to a method, only the reference is passed
    // Any modifications made to the array inside the method affect the original array
    public static void modify(int[] numbers)
    {
       numbers[0] = 100;
    }

    // If an array in a method is assigned to another location then it would not change the original array.
    public static void changeReference(int[] numbers)
    {
        numbers = new int[5];
        numbers[0] = 200;
    }

    public static void getElements(int[] numbers)
    {
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < numbers.length; i++)
        {
            System.out.println("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
    }

}