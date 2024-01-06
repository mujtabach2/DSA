// create a avl tree with these number 25, 20, 5, 34, 50, 30, 10
public class Driver {
    public static void main(String[] args) {
        AVL tree = new AVL();
        tree.insertion(25);
        tree.insertion(20);
        tree.insertion(5);
        tree.insertion(34);
        tree.insertion(50);
        tree.insertion(30);
        tree.insertion(10);
        tree.preOrder(tree.root);
    }
}
// avl tree visualization 
//
//         25
//        /  \
//       5    34
//      / \   / \
//     0  10 30 50
//        /
//       20

