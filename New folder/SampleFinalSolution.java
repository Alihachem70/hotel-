
package samplefinalsolution;

public class SampleFinalSolution {
    public static void main(String[] args) {
        //a
        Venue v1 = new Venue("Dunes",4000);
        
        //b
        v1.addRoom(new Hall(250,"Red",12));
        v1.addRoom(new Hall(100,"blue",15));
        v1.addRoom(new Theater(250,true,110));
        v1.addRoom(new Theater(50,false,115));
        
        //c
        System.out.println("Information about the venue:");
        System.out.println(v1.toString());
        
        //d
        System.out.println("-------------------------");
        System.out.println("Trying to reserve a hall with required size of 200");
        if(v1.reserveHall(200))
            System.out.println("SUCCESSFUL");
        else
            System.out.println("FAILED");
        
        //e
        System.out.println("------------------------------------\n"+
                "Number of reserved rooms : "+v1.getNbOfReservedRooms());
        
        //f
        v1.freeAll();
      
        System.out.println("Information about the venue after freeAll:");
        System.out.println(v1.toString());   
    } 
}
