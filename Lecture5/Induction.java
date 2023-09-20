 public class Induction {

    public static void summation()
    {
        int n = 100000;
        int sum = 0;
        for (int i = 0; i <= n; i++)
        {
            sum += i;
        }
        System.out.println("sum: " + sum);
    }

    public static void summation_induction()
    {
        int n = 100000;
        int result = n * (n + 1) / 2;

        System.out.println("result: " + result);
    }
    public static void main(String[] args)
    {
        double starTime = (double) System.nanoTime();
        summation();
        double endTime = (double) System.nanoTime();

        double duration = (endTime - starTime);
        double seconds = duration / 1000000000.0;
        System.out.println("duration: %.6f \n" + seconds);

        //induction
        double starTime2 = (double) System.nanoTime();
        summation_induction();
        double endTime2 = (double) System.nanoTime();

        double duration2 = (endTime2 - starTime2);
        double seconds2 = duration2 / 1000000000.0;
        System.out.println("duration: %.6f \n" + seconds2);
    }

 }