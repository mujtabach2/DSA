public class SquareInduction {

    public static void square_summation()
    {
        int n = 1000;
        int result = 0;

        for (int i = 0; i<=n; i++)
        {
            result+=(i*i);
        }

        System.out.println("Result: " + result);
    }

    public static void squared_induction()
    {
        int n = 1000;
        int result = 0;

        result = n*(n+1)*(2*n + 1)/6;

        System.out.println("Result: " + result);

    }
    public static void main(String[] args) {
        double starTime = (double)System.nanoTime();
        square_summation();
        double endTime = (double) System.nanoTime();

        double duration = endTime - starTime;
        double seconds = (double)duration/1000000000;

        System.out.printf("Duration: %.6f \n", seconds);


        double starTime_1 = (double)System.nanoTime();
        squared_induction();
        double endTime_1 = (double) System.nanoTime();

        double duration_1 = endTime_1 - starTime_1;
        double seconds_1 = (double)duration_1/1000000000;

        System.out.printf("Duration: %.6f \n", seconds_1);
    }
}