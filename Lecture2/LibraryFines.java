package Lecture2;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LibraryFines {

    public static String calculateFines(LocalDate dueDate, LocalDate returnDate)
    {
        long days = ChronoUnit.DAYS.between(dueDate, returnDate);
        
        if (days == 0)
        {
            return "No Fine";
        }
        return String.valueOf(2 * days) + " dollars fine";
    }
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter return date in dd mm yyyy format: ");
       System.out.print("Day (dd): ");
       int days = scanner.nextInt();
       System.out.print("Month (mm): ");
       int months = scanner.nextInt();
       System.out.print("Year (yyyy): ");
       int years = scanner.nextInt();
       scanner.close();

       LocalDate returnDate = LocalDate.of(years, months, days);

       LocalDate dueDate = LocalDate.of(2023, 9, 5);
       System.out.println("Due Date: " + dueDate.toString());

       System.out.println(calculateFines(dueDate, returnDate));
    }
}
