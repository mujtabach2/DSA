package Interfaces;

public class Driver {
    public static void main(String[] args) {
        Ones ones = new Ones();
        
        for (int i =0; i<5; i++)
        {
            System.out.println("Next value: " + ones.getNext());
        }

        ones.setStart(100);
        for (int i =0; i<5; i++)
        {
            System.out.println("Next value: " + ones.getNext());
        }

        ones.reset();
        for (int i =0; i<5; i++)
        {
            System.out.println("Next value: " + ones.getNext());
        }

        Twos twos = new Twos();

        for (int i =0; i<5; i++)
        {
            System.out.println("Next value: " + twos.getNext());
        }
    }
}