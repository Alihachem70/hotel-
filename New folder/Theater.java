package samplefinalsolution;

public class Theater  extends Room{
    private int capacity = 100;
    private boolean withScreen;

    public Theater(int capacity,boolean withScreen, int number) {
        super(number);
        setCapacity(capacity);
        this.withScreen = withScreen;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isWithScreen() {
        return withScreen;
    }

    public void setCapacity(int capacity) {
        if(capacity > 0)
            this.capacity = capacity;
    }

    public void setWithScreen(boolean withScreen) {
        this.withScreen = withScreen;
    }    
    
    public String toString(){
        String s = "Theater: " + capacity + " persons, ";
        if(withScreen)
            s += "with screen";
        else
            s += "without screen";
        return s + super.toString();
    }
}
