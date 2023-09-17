public class Driver 
{
    public static void main(String[] args)
    {
        Number number = new Number(5.834342);
        Number.Precision precision = number.new Precision();
        double result = precision.setPrecision(number.number);

        // Print the result
        System.out.println("Original Number: " + number.number);
        System.out.println("Number with Precision 2: " + result);
    }
}
