

import java.util.Arrays;

public class Driver{
    public static void selectionSort(int[] nums)
    {

        
        int size = nums.length;
        for(int i=0 ; i<size-1 ; i++)
        {
            int min = i;
            // find the minimum element in the unsorted array
            // swap it with the current element all numbers before i are sorted
            for(int j=i+1 ; j<size ; j++)
            {
                if(nums[j] < nums[min])
                {
                    min = j;
                }
            }
            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
        }

    }

    public static void main(String[] args) {
        int[] numbers = new int[]{7, 10, 8, 1, 9, 2, 4, 3};
        System.out.println(Arrays.toString(numbers));
        selectionSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}