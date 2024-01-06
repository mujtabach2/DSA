// You are required to write a Java function, public static double getAffordableProductsPercentage (Product[] products) that takes in an array of Product objects and returns the percentage of the affordable products in the form of a double.

// You are provided with the structure of the class and you are expected to fill in the getAffordableProductsPercentage method. Please note the followings:

// Make sure to create a Product class with 2 private data members, String name and int price. This class should have at least one parameterized constructor.
// Function getAffordableProductsPercentage should use a HashMap to calculate the percentage by categorizing products into Affordable and Expensive. Please note that products with price <= 50 are considered Affordable else Expensive.
// You are not allowed to use any other data structure than HashMap and array. No built-in functions from any other library are permitted.
// Make sure your program runs successfully for all the test cases in the main method.
// You are not expected to make changes to the main method.
// The output of the program should be something like:
// Percentage of Affordable Products in Cart 1: 50.0

// Percentage of Affordable Products in Cart 2: 0.0
public class Product {
        private String name;
        private int price;

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }
        public Product(String name, double price) {
            this.name = name;
            this.price = (int) price;

        }
    }



