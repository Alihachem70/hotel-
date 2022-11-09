package samplefinalsolution;

import java.util.ArrayList;

public class Venue {
    private String name;
    private ArrayList<Room> rooms = new ArrayList();
    private double reservationCost;

    public Venue(String name, double reservationCost) {
        this.name = name;
        this.reservationCost = reservationCost;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public double getReservationCost() {
        return reservationCost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReservationCost(double reservationCost) {
        this.reservationCost = reservationCost;
    }
    
    public void addRoom(Room newRoom){
        rooms.add(newRoom);
    }
    
    public int getNbOfRooms(){
        return rooms.size();
    }
    
    public int getNbOfReservedRooms(){
        int count = 0;
        for (int i = 0; i < rooms.size(); i++)
            if(rooms.get(i).isReserved())
                count++;
        return count;
    }
    
    public int countTheater(){
        int count=0;
        for (int i=0; i<rooms.size();i++)
            if(rooms.get(i) instanceof Theater)
                count++;
        return count;
    }
    
    public int countHall(){
        int count=0;
        for (int i = 0; i < rooms.size(); i++)
            if(rooms.get(i) instanceof Hall)
                count++;
        return count;
    }
    
    public boolean reserveHall(double requiredSize){
        for (int i = 0; i < rooms.size(); i++)
            if(rooms.get(i) instanceof Hall){  
                Hall h = (Hall) rooms.get(i);
                if(h.getSize() >= requiredSize){
                    h.setReserved(true);
                    return true;
                }
            }
        return false;
    }
    
    public void freeAll(){
        for (int i = 0; i < rooms.size(); i++)
            rooms.get(i).setReserved(false);
    }
    
    @Override
    public String toString(){
        String s = "Venue: " + name + ", Reservation Cost:" + reservationCost + ", ";
        s += getNbOfRooms() + " Rooms:" + countTheater() + " Theaters, " + countHall() + " Halls.";
        return s;
    }
}
