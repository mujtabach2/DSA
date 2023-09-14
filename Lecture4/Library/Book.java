package Library;

public final class Book {
    String name, author;
    final int SIZE = 10;
    // final is the same as const in C++
    // to prevent class from being inherited, use final

    public Book(String name, String author)
    {
        this.name = name;
        this.author = author;
    }

    public final String toString()
    {
        return "Book: " + this.name + " by " + this.author;
    }
    // methods can be made final too
}

// when u create a subfolder u have to write the name of the subfolder 
