
package samplefinalsolution;

public class Room {
    private int number;
    private boolean reserved;

    public Room(int number) {
        setNumber(number);
    }

    public int getNumber() {
        return number;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setNumber(int number) {
        if (number > 0)
            this.number = number;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }
    
    @Override
    public String toString(){
        String s = "Room number " + number + ", ";
        if(reserved)
            s += "reserved";
        else 
            s += "not reserved";
        return s;   
    }
}
