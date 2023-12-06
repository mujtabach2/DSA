public class Driver {


    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insertNode(5);
        tree.insertNode(10);
        tree.insertNode(2);
        tree.insertNode(11);
        tree.insertNode(1);
        tree.insertNode(3);
        tree.insertNode(20);
        tree.insertNode(15);
        tree.insertNode(90);

        tree.printNodes();
    }
}