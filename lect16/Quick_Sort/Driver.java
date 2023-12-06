
import java.util.Arrays;

public class Driver
{
    public static void swap(int[] nums, int i ,int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    public static int partition(int[] nums,int start, int end)
    {
        // pivot is the last element
        int pivot = nums[end];
        // make i point to the index of the smaller element
        int i = start - 1;

        // iterate through the array
        for(int j = start; j < end; j++)
        {
            // if the current element is smaller than the pivot
            if(nums[j] <= pivot)
            {
                // increment i and swap the elements
                i++;
                swap(nums,i,j);
            }
        }
        // swap the pivot with the element at index i+1
        // since i is the index of the smaller element when i and j cross each other
        swap(nums,i+1,end);
        // return the index of the pivot
        return i;
    }

    public static void quickSort(int[] nums, int start, int end)
    {
        // if the array has more than one element
        if(start < end)
        {
            // partition the array, aka find pivot
            int partitionIndex = partition(nums,start,end);
            // recursively sort the left and right subarrays
            quickSort(nums,start,partitionIndex-1);
            quickSort(nums,partitionIndex+1,end);
        }
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{8, 2, 7, 3, 10, 15, 6};
        System.out.println(Arrays.toString(numbers));
        quickSort(numbers, 0, numbers.length-1);
        System.out.println(Arrays.toString(numbers));
    }
}