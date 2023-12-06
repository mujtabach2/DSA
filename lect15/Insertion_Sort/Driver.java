package Insertion_Sort;

import java.util.Arrays;

public class Driver {
    public static void insertionSort(int[] nums)
    {
        int size = nums.length;

        // start from the second element
        // compare it with all the elements before it
        // if the element is smaller than the current element
        // shift all the elements to the right
        // insert the element at the correct position
        for(int i=1 ; i<size ; i++)
        {
            int curr = nums[i];
            int j = i-1;
            while(j>=0 && nums[j]>curr)
            {
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = curr;
        }
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{7, 10, 8, 1, 9, 2, 4, 3};
        System.out.println(Arrays.toString(numbers));
        insertionSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
