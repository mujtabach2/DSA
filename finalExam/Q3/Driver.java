import java.util.HashMap;

// in own file 
// public class Product {
//     private String name;
//     private int price;

//     public String getName() {
//         return name;
//     }

//     public int getPrice() {
//         return price;
//     }
//     public Product(String name, double price) {
//         this.name = name;
//         this.price = (int) price;

//     }
// }

public class Driver {

    public static double getAffordableProductsPercentage(Product[] products) {
        // Fill in this method
        if (products.length == 0) {
            return 0.0;
        }
        HashMap<String, Integer> affordable = new HashMap<String, Integer>();
        HashMap<String, Integer> expensive = new HashMap<String, Integer>();
        
        
        for (Product product : products) {
            if (product.getPrice() <= 50) {
                if (affordable.containsKey(product.getName())) {
                    affordable.put(product.getName(), affordable.get(product.getName()) + 1);
                } else {
                    affordable.put(product.getName(), 1);
                }
            } else {
                if (expensive.containsKey(product.getName())) {
                    expensive.put(product.getName(), expensive.get(product.getName()) + 1);
                } else {
                    expensive.put(product.getName(), 1);
                }
            }
        }

        return (double) affordable.size() / (affordable.size() + expensive.size()) * 100;

    }

    public static void main(String[] args) {
        Product[] shoppingCart1 = {
                new Product("Bread", 3.0),
                new Product("Bicycle", 170.0),
                new Product("Eggs", 4.0),
                new Product("Lego", 100.0),
        };

        Product[] shoppingCart2 = {};

        System.out.println("Percentage of Affordable Products in Cart 1: " + getAffordableProductsPercentage(shoppingCart1));
        System.out.println("Percentage of Affordable Products in Cart 2: " + getAffordableProductsPercentage(shoppingCart2));
    }
}