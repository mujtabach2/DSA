package MultiDim_Arrays;

public class Driver {
    
    public static void display(int[][] numbers)
    {
        // step 1 identify the O(n) of each statement 
        // O(1)  0(n) O(1)
         for (int i =0; i<numbers.length; i++)
        {
            for (int j=0; j<numbers[i].length; j++)
            {
                System.out.println(numbers[i][j]); //o(1)
            }
        }
    }
    // step 2: make an equarion = o(1) + o(n) * o(1) + o(1)
    // step 3: remove the constants = o(n) * o(1) = o(n)
    // step 4: remove the non-dominant terms = o(n)
    // step 5: write the final answer = o(n)
    public static void main(String[] args) {
        int[][] numbers = new int[][]{{1,2,3}, {4, 5, 6}};
        display(numbers);

    }
}