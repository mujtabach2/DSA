public class Testing {
    public void test()
    {
        System.out.println("This is a member function of Testing class");
    }
    public void test_2()
    {
        System.out.println("This is another member function of Testing class");
    }
    public static void main(String[] args)
    {
        Testing t = new Testing();
        t.test();   
        t.test_2();
    }
}
