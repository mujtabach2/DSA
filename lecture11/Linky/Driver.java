public class Driver {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertElement(2);
        list.insertElement(4);
        list.insertElement(6);
        list.insertElement(8);
        list.insertElement(10);

        System.out.println("Before deleting...");
        list.print();

        list.delete(2);
        list.delete(6);
        list.delete(8);
        list.delete(4);
        list.delete(10);
        System.out.println("After deleting...");
        list.print();
    }
}