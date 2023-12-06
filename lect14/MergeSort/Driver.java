package MergeSort;

import java.util.Arrays;

public class Driver {
    public static void mergeSort(int[] numbers)
    {
        int size = numbers.length;

        if (size < 2)
        {
            return;
        }

        int mid = size / 2; 

        int[] left = new int[mid];
        int[] right = new int[size - mid];

        for (int i = 0; i < mid; i++)
        {
            left[i] = numbers[i];
        }

        for (int i = mid; i < size; i++)
        {
            right[i - mid] = numbers[i];
        }

        mergeSort(left);
        mergeSort(right);
        merge(numbers, left, right);
    }

    public static void merge(int numbers[], int left[], int right[])
    {
        int leftSize = left.length;
        int rightSize = right.length;

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize)
        {
            if (left[i] <= right[j])
            {
                numbers[k] = left[i];
                i++;
            }
            else
            {
                numbers[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < leftSize)
        {
            numbers[k] = left[i];
            i++;
            k++;
        }

        while (j < rightSize)
        {
            numbers[k] = right[j];
            j++;
            k++;
        }  
    }
    public static void main(String[] args) {
        int[] numbers = new int[] {7, 10, 8, 1, 9, 2, 4, 3};
        System.out.println(Arrays.toString(numbers));
        mergeSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}