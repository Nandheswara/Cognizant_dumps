import java.util.*;
import java.io.*;
import java.sql.*;

public class RainfallReport {

	//Write the required business logic as expected in the question description
	public List<AnnualRainfall> generateRainfallReport(String filePath) throws InvalidCityPincodeException{
	    List<AnnualRainfall> ar=new ArrayList<>();
	    try{
    	    FileInputStream fis=new FileInputStream(filePath);
    	    Scanner sc= new Scanner (fis);
    	    while (sc.hasNext())
    	    {
    	        String line=sc.nextLine();
    	        String []lineArr= line.split(",");
    	        boolean b=false;
    	        try {
    	            b=validate(lineArr[0]);}
    	        catch (InvalidCityPincodeException e)
	             {
	                System.out.println(e);        
	             }
    	        if (b)
    	        {
    	            double []monthlyRainfall=new double[12];
    	            for (int counter=0;counter<12;counter++)
    	            {
    	                monthlyRainfall[counter]=Double.parseDouble(lineArr[counter+2]);
    	            }
    	            AnnualRainfall annualRainfall= new AnnualRainfall();
    	            annualRainfall.calculateAverageAnnualRainfall(monthlyRainfall);
    	            annualRainfall.setCityPincode(Integer.parseInt(lineArr[0]));
    	            annualRainfall.setCityName(lineArr[1]);
    	            ar.add(annualRainfall);
    	        }
    	        
    	    }
    	    sc.close();
	    }
	    catch (Exception e)
	    {
	        System.out.println(e);
	    }
	    
		//fill the code
	    return ar;	
	}
	
	public List<AnnualRainfall>  findMaximumRainfallCities() {
	
		//fill the code
		List<AnnualRainfall> alist= new ArrayList<>();
		try{
		    DBHandler dbh= new DBHandler();
		    Connection con = dbh.establishConnection();
		    String q="select * from AnnualRainfall where average_annual_rainfall=(select max(average_annual_rainfall) from AnnualRainfall)";
		    PreparedStatement ps= con.prepareStatement(q);
		    ResultSet rs=ps.executeQuery();
		    while (rs.next())
		    {
		        AnnualRainfall obj= new AnnualRainfall();
		        obj.setCityPincode(rs.getInt(1));
		        obj.setCityName(rs.getString(2));
		        obj.setAverageAnnualRainfall(rs.getDouble(3));
		        alist.add(obj);
		    }
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
		return alist;
		
	}
	
	
	public boolean validate(String cityPincode) throws InvalidCityPincodeException {
// 	int l=cityPincode.length();
// 	if (l==5)
// 	{
// 	    return true;
// 	}
// 	else
// 	{
// 	    throw new InvalidCityPincodeException();
// 	}
	
	
		//fill the code
    // 	try {
    	    if (cityPincode.length()!=5)
    	    {
    	        throw new InvalidCityPincodeException("Invalid City Pincode");
    	    }
    	    for (int ic=0;ic<5;ic++)
    	   // for (char g : cityPincode)
    	    {
    	        if (!Character.isDigit(cityPincode.charAt(ic)))
    	        {
    	            throw new InvalidCityPincodeException("Invalid City Pincode Exception");
    	        }
    	    }
    	    return true;
    // 	}
    // 	catch(InvalidCityPincodeException e)
    // 	{
    // 	    System.out.println(e.getMessage());
    // 	    return false;
    // 	}
	}

}
