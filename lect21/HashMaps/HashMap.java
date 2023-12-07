 

 class Node
 {
    int key;
    int value;
    Node next;

    Node(int key, int value)
    {
        this.key = key;
        this.value = value;
    }

    public int getKey()
    {
        return this.key;
    }

    public int getValue()
    {
        return this.value;
    }

    public void setValue(int value)
    {
        this.value = value;
    }
 }


class HashMap{
    Node table[];
    int size;

    HashMap(int size)
    {
      this.size = size;
      table = new Node[size];
    }

    void put(int key, int value)
    {
        int hash = key % size;

        Node node = table[hash];

        if(node == null)
        {
            table[hash] = new Node(key, value);
        }
        else
        {
            // loop through the linked list TO SEE IF THE KEY ALREADY EXISTS
            while (node.next != null)
            {
                if(node.getKey() == key)
                {
                    node.setValue(value);
                    return;
                }
                node = node.next;
            }

            // Check if the last node has the same key
            if(node.getKey() == key)
            {
                node.setValue(value);
                return;
            }

            // If not, add a new node to the end of the list
            node.next = new Node(key, value);
        }
    }

    int get(int key)
    {
        int hash = key % size;

        Node node = table[hash];

        if(node == null)
        {
            return -1;
        }

        while (node != null)
        {
            if(node.getKey() == key)
            {
                return node.getValue();
            }
            node = node.next;
        }

        return -1;
    }
}
