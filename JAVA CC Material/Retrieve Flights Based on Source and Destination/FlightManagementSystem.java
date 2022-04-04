import java.util.ArrayList;
import java.sql.*;


public class FlightManagementSystem {
    
    public ArrayList<Flight> viewFlightBySourceDestination(String source, String destination){
        ArrayList<Flight> flightList = new ArrayList<Flight>();
        try{
            Connection con = DB.getConnection();
            
            String query="SELECT * FROM flight WHERE source= '" + source + "' AND destination= '" + destination + "' "; 
            
            Statement st=con.createStatement();
            
            ResultSet rst= st.executeQuery(query);
            
            while(rst.next()){
                int flightId= rst.getInt(1);
                String src=rst.getString(2);
                String dst=rst.getString(3);
                int noofseats=rst.getInt(4);
                double flightfare=rst.getDouble(5);
                
                flightList.add(new Flight(flightId, src, dst, noofseats, flightfare));
            }
        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
        return flightList;
    }
    
}