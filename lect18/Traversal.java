import java.util.LinkedList;

class Node
{
    int value;
    Node left;
    Node right;

    Node(int value)
    {
        this.value = value;
    }
}

class Traversal
{

    public static void levelOrder(Node root)
    {
        LinkedList<Node> list = new LinkedList<>();
        list.add(root);

        while(!list.isEmpty())
        {
            Node node = list.remove();
            System.out.print(node.value + " ");

            if(node.left != null)
                list.add(node.left);
            if(node.right != null)
                list.add(node.right);
        }
    }

    public static void preOrder(Node root)
    {
        //Visit Order: Node -> Left Subtree -> Right Subtree
        if(root == null)
            return;

        System.out.print(root.value + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root)
    {
        // Visit Order: Left Subtree -> Node -> Right Subtree
        if(root == null)
            return;

        inOrder(root.left);
        System.out.print(root.value + " ");
        inOrder(root.right);
    }

    public static void postOrder(Node root)
    {
        // Visit Order: Left Subtree -> Right Subtree -> Node
        if(root == null)
            return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.value + " ");
    }

    public static boolean delete(Node root, int value)
    {
        Node currentNode = root;
        Node parent = root;
        boolean isLeft = false;
        // Find the node to be deleted
        while (currentNode.value != value)
        {
            // Keep track of the parent node
            parent = currentNode;
            // Check if the value is in the left or right subtree   
            if (value < currentNode.value)
            {
                isLeft = true;
                currentNode = currentNode.left;
            }
            else
            {
                isLeft = false;
                currentNode = currentNode.right;
            }
            // If the node is not found
            if (currentNode == null)
            {
                return false;
            }
        }

        // If the node to be deleted is a leaf node
        //if it is not a leaf node it will not be deleted
        if (currentNode.left == null && currentNode.right == null)
        {
            if (currentNode == root)
            {
                root = null;
            }
            else 
            {
                if (isLeft)
                {
                    parent.left = null;
                }
                else
                {
                    parent.right = null;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {

        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.left = new Node(12);
        root.right.right = new Node(25);

        System.out.println("Level Order Traversal");
        levelOrder(root);

        System.out.println("\nPre Order traversal:");
        preOrder(root);
        
        System.out.println("\nIn Order traversal:");
        inOrder(root);

        System.out.println("\nIn Post traversal:");
        postOrder(root);

        System.out.println("\nDelete node with value 3");
        System.out.println(delete(root, 3));
        System.out.println("In Order traversal:");
        inOrder(root);

    }
}
