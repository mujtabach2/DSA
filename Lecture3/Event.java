import java.time.LocalDate;

public class Event {
    String description;
    String date;

    public Event()
    {
        this.description = "";
        this.date = "";
    }

    public Event(String description, LocalDate date)
    {
        this.description = description;
        this.date = date;
    }

    public display()
    {
        System.out.println(this.description);
        System.out.println(this.date);
    }
    
}
