package Interfaces;

public class Twos implements Series{
    int start;
    int value;

    Twos()
    {
        this.start = 0;
        this.value = 0; 
    }
    
    public int getNext()
    {
        this.value += 2;
        return this.value;
    }

    public void reset()
    {
        this.value = this.start;
    }

    public void setStart(int x)
    {
        this.start = x;
        this.value = x;
    }
}
