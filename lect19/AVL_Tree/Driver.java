
public class Driver {
    public static void main(String[] args) {
        AVL tree = new AVL();
        tree.insertion(10);
        tree.insertion(20);
        tree.insertion(30);
        tree.insertion(40);
        tree.insertion(50);
        tree.insertion(25);
        tree.preOrder(tree.root);
    }
}