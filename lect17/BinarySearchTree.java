import java.util.Stack;

class Node{
    int value;
    Node left;
    Node right;
    Node(int value){
        this.value = value;
        left = null;
        right = null;
    }
}


public class BinarySearchTree
{
    Node root;

    public void insertNode(int value)
    {
        Node node = new Node(value);

        if(root == null)
        {
            root = node;
            return;
        }
        else{
            Node current = root;
            Node parent = null;

            while(true)
            {
                parent = current;
                // if the value is less than the current value, go left
                if(value < current.value)
                {
                    current = current.left;
                    // if current is null, then we found our spot
                    if(current == null)
                    {
                        parent.left = node;
                        return;
                    }
                }
                else{
                    // if the value is greater than the current value, go right
                    current = current.right;
                    // if current is null, then we found our spot
                    if(current == null)
                    {
                        parent.right = node;
                        return;
                    }
                }
            }
        }
    }

    // time complexity: O(n)
    //space complexity: O(n)
    public void printNodes()
    {
        Stack<Node> stack = new Stack<>();
        Node current = root;

        while(current != null || stack.size() > 0)
        {
            if (current != null)
            {
                stack.push(current);
                current = current.left;
            }
            else{
                current = stack.pop();
                System.out.println(current.value + " ");
                current = current.right;
            }
    
        }
    }

    public Node search(int value)
    {
        Node currentNode = root;

        while (currentNode.value != value)
        {
            if (value < currentNode.value)
            {
                currentNode = currentNode.left;
            }
            else
            {
                currentNode = currentNode.right;
            }

            if (currentNode == null)
            {
                return null;
            }
        }
        return currentNode;

        // Time Complexity: O(logn)
        // Space Complexity: O(n)
    }
    public void insertion(int value)
    {
        root = insertNode_recursion(root, value);
    }

    public Node insertNode_recursion(Node root, int value)
    {
        if (root == null)
        {
            root = new Node(value);
            return root;
        }
        else if (value < root.value)
        {
            root.left = insertNode_recursion(root.left, value);
        }
        else
        {
            root.right = insertNode_recursion(root.right, value);
        }
        return root;
    }

    public Node search_recursion(Node root, int value)
    {
        if (root == null || root.value == value)
        {
            return root;
        }
        if (value < root.value)
        {
            return search_recursion(root.left, value);
        }
        else
        {
            return search_recursion(root.right, value);
        }
        // Time Complexity: O(logn)
        // Space Complexity: O(n)
    }

    public void search_it(int value)
    {
        if (search_recursion(root, value) == null)
        {
            System.out.println("\nElement not found");
        }
        else
        {
            System.out.println("\nElement found");
        }
    }
}


