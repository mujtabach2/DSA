public class Driver{
    public static int constant_function(int arr[])
    {
        int number = 0; // O(1)
        return number; // O(1)
        // total time = O(1) + O(1) = O(2) = O(1) which is constant 
    }
    public static int linear_function(int arr[])
    {
        int number = 0; // O(1)
        for(int i = 0; i < arr.length; i++) // O(n)
        {
            number += arr[i]; // O(1)
        }
        return number; // O(1)
        // total time = O(1) + O(n) + O(1) = O(n) which is linear
    }

    public static void sum_product(int arr[])
    {
        int sum = 0; // O(1)
        for (int i = 0; i < arr.length; i++) // O(n)
        {
            sum += arr[i]; // O(1)
        }
        System.out.println(sum); // O(1)

        int product = 0; // O(1)
        for (int i = 0; i < arr.length; i++) // O(n)
        {
            product *= arr[i]; // O(1)
        }
        System.out.println(product); // O(1)
        // total time = O(1) + O(n) + O(1) + O(1) + O(n) + O(1) + O(1) = O(2n) = O(n) which is linear
    }


    // O(n^2) = quadratic  Quadratic Time is when nested loops come into play
    public static void pairs(int arr[])
    {
        for (int i = 0; i < arr.length; i++) // O(n)
        {
            for (int j = 0; j < arr.length; j++) // O(n)
            {
                System.out.println(arr[i] + "," + arr[j]); // O(1)
            }
        }
        // total time = O(n) * O(n) * O(1) = O(n^2) which is quadratic
    }

    public static void two_arrays(int arr1[], int arr2[])
    {
        for (int i=0; i<arr1.length; i++)  // this runs n times
        {
            for (int j=0; j<arr2.length; j++) // this runs m times
            {
                System.out.printf("(%d,%d)", arr1[i], arr2[j]);  //O(1)
            }
        }
        // total time = O(n) x O(m) x O(1) = O(nxm)
    }
    // matrix arrays are also quadratic time O(n^2)
  
    public static void main(String[] args) {
        int arr[] = new int[5];
        System.out.println(constant_function(arr));

        int arr1[] = new int[]{1, 2, 3, 4, 5};
        int arr2[] = new int[]{6, 7, 8};
        two_arrays(arr1, arr2); 
    }
}
//
// identify the Input Size (n):
// Identify Basic Operations:

// Count the Number of Basic Operations:
// Analyze the algorithm and count how many times the basic operations are executed in terms of the input size 

// Simplify the Expression:

// Determine the Time Complexity Notation:
public static int mod(int a, int b) {
        if (b <= 0) {
            return -1;
        }
        int div = a / b;
        return a - div * b;
    }
// O(1) constant time
