package Space_Complexity;

public class Driver{


    public static int[] running_sum(int numbers[])
    {
        int sum = 0;
        int result[] = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++)
        {
            sum += numbers[i];
            result[i] = sum;
        }
        return result;
    }

    public static void main(String[] args)
    {
        int numbers[] = new int[]{1,2,3,4,5}; // 1, 3, 6, 10, 15
    }
}