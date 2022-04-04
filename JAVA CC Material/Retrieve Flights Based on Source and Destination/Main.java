import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the source");
        String source=sc.next();
        System.out.println("Enter the destination");
        String destination=sc.next();
        
        FlightManagementSystem fms= new FlightManagementSystem();
        ArrayList<Flight> flightList=fms.viewFlightBySourceDestination(source,destination);
        if(flightList.isEmpty()){
            System.out.println("No flights available for the given source and destination");
            return;
        }
        System.out.println("Flightid Noofseats Flightfare");
        for(Flight flight : flightList){
            System.out.println(flight.getFlightId()+" "+flight.getNoOfSeats()+" "+flight.getFlightFare());
        }
        
    }
}