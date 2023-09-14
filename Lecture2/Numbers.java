package Lecture2;

public class Numbers {
    public static double power(int base , int exponent)
    {
        double result = 1;

        for (int i = 0; i < exponent; i++)
        {
            result *= base;
        }
        return result;
    }

    public static double square_root(int number)
    {
        return Math.sqrt(number);
    }

    public static int abs(int number)
    {
        // if the number is less than 0 then negate it otherwise return the number
        return (number < 0) ? -number : number;
    }
    public static void casting(int number)
    {
        int i = 10;
        double d = i;
        float f = i;
        //allows u too convert one data type to another
        System.out.println("Integer : " + i);
        System.out.println("Double : " + d);
        System.out.println("Float : " + f);

        //narrow castign will make a error  or loss of data
        // double d = 10.5;
        // int i = d;

        // System.out.println("Integer : " + i);
        // System.out.println("Double : " + d);

        //explicit casting
        double d1 = 10.5;
        int i1 = (int)d1;

        System.out.println("Integer : " + i1);
        System.out.println("Double : " + d1);

        //narrow casting allowed with explicit casting
        double da = 10.5;
        int ia = (int) d;
        System.out.println("Integer : " + ia);
        System.out.println("Double : " + da);

        
        
    }
    public static void main(String[] args)
    {
        System.out.println(power(2, 3));
        System.out.println(square_root(25));
        System.out.println(abs(-5));
        casting(10);

    }
}
