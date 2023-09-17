public class Number
{
    double number;
    public Number(int number)
    {
        this.number = (double) number;
    }
    public Number(double number)
    {
        this.number = number;
    }

    public class Precision
    {
        public double setPrecision(double number)
        {
            return Math.round(number *100) /100.00 ;
        }
    }
}
