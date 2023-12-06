package MinMax;

import java.util.Arrays;


public class Driver {
    
    public static int[] findMinMax(int A[], int start,int end)
    {
        int max, min;
        if(start == end )
        {
            max = A[start];
            min = A[start];
        }
        else if(start+1 == end)
        {
            if(A[start] > A[end])
            {
                max = A[start];
                min = A[end];
            }
            else
            {
                max = A[end];
                min = A[start];
            }
        }
        else
        {
            int mid = (end - start)/2;
            int[] left = findMinMax(A, start, start+mid);
            int[] right = findMinMax(A, start+mid+1, end);

            // remember left[0] is max of left array and left[1] is min of left array
            if(left[0] > right[0])
            {
                max = left[0];
            }
            else
            {
                max = right[0];
            }
            if(left[1] < right[1])
            {
                min = left[1];
            }
            else
            {
                min = right[1];
            }
        }
        int[] result = {max, min};
        return result;
    }

    public static void main(String[] args) {

        int numbers[] = new int[]{7, 10, 8, 1, 9, 2, 4, 3};

        System.out.println(Arrays.toString(findMinMax(numbers, 0, numbers.length-1)));
        
    }
}
