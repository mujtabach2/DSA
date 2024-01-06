class Student {
    String firstName;
    String lastName;
    int rank;

    public Student(String firstName, String lastName, int rank) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rank = rank;
    }


    public String toString() {
        return rank + " " + firstName + " " + lastName;
    }
}

class Node {
    Student data;
    Node left;
    Node right;

    public Node(Student data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}



public class Driver {
    
    public static Node removeDuplicates(Node root) {
        // Implement your code here
        if (root == null || (root.left == null && root.right == null)) {
            return root;
        }
    
       
        root.left = removeDuplicates(root.left);
        root.right = removeDuplicates(root.right);
      
        if (root.left != null && root.left.data.rank == root.data.rank) {
            root.left = root.left.right;


        }
        if (root.right != null && root.right.data.rank == root.data.rank) {
        
            root.right = root.right.left;

        }
    
        
        return root;
    }
    
    

    public static void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println("rank:" + root.data.rank + " -> " + root.data.firstName + " " + root.data.lastName);
            inOrder(root.right);
        }
    }

    public static void main(String[] args) {
        Node root = null;

        // Testing with Null Tree
        System.out.println("\n************ Testing with Null Tree *************");
        System.out.println("Original BST:");
        inOrder(root);
        root = removeDuplicates(root);
        System.out.println("\nBST after removing duplicates based on Rank:");
        inOrder(root);
        System.out.println("*************************************************");

        // Testing with Julie = 3 Tree
        root = new Node(new Student("Alice", "Johnson", 5));
        root.left = new Node(new Student("Bob", "Smith", 3));
        root.right = new Node(new Student("Aisha", "Saleem", 6));
        root.left.left = new Node(new Student("Tim", "David", 2));
        root.left.right = new Node(new Student("Elli", "Miller", 4));
        root.right.right = new Node(new Student("Eve", "Smith", 7));
        root.left.right.left = new Node(new Student("Julie", "Stone", 3));
        root.left.left.left = new Node(new Student("Ola", "Becker", 1));

        System.out.println("\n************ Testing with Julie = 3 Tree *************");
        System.out.println("Original BST:");
        inOrder(root);
        root = removeDuplicates(root);
        System.out.println("\nBST after removing duplicates based on Rank:");
        inOrder(root);
        System.out.println("*************************************************");

        // Testing with Julie = 5 Tree
        root = new Node(new Student("Alice", "Johnson", 5));
        root.left = new Node(new Student("Bob", "Smith", 3));
        root.right = new Node(new Student("Aisha", "Saleem", 6));
        root.left.left = new Node(new Student("Tim", "David", 2));
        root.left.right = new Node(new Student("Elli", "Miller", 4));
        root.right.right = new Node(new Student("Eve", "Smith", 7));
        root.left.right.right = new Node(new Student("Julie", "Stone", 5));
        root.left.left.left = new Node(new Student("Ola", "Becker", 1));

        System.out.println("\n************ Testing with Julie = 5 Tree *************");
        System.out.println("Original BST:");
        inOrder(root);
        root = removeDuplicates(root);
        System.out.println("\nBST after removing duplicates based on Rank:");
        inOrder(root);
        System.out.println("*************************************************");
    }
}
