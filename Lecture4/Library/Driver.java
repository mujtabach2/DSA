package Library;

public class Driver {
    public static void main(String[] args){
        // Book book = new Book("Harry Potter", "J.K. Rowling");
        // Journal journal = new Journal("Journal of the American Medical Association");
        // System.out.println(book.toString());
        // System.out.println(journal.toString());
        try{
            int num[] = new int[3];
            System.out.println(num[5]);
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }    
}
