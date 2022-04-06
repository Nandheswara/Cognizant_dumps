import java.util.*;
public class Main {

   public static void main(String[] args) throws InvalidCityPincodeException { 
   
	   //fill the code
	   RainfallReport r= new RainfallReport();
	   List<AnnualRainfall>aall=r.generateRainfallReport("AllCityMonthlyRainfall.txt");
	   for (AnnualRainfall a : aall)
	   {
	       System.out.println(a.getCityPincode()+" "+a.getCityName()+" "
	       +a.getAverageAnnualRainfall());
	   }
	   System.out.println("");
	   System.out.println("");
	   System.out.println("");
	   System.out.println("");
	   List<AnnualRainfall>aal=r.findMaximumRainfallCities();
	   for (AnnualRainfall a : aal)
	   {
	       System.out.println(a.getCityPincode()+" "+a.getCityName()+" "
	       +a.getAverageAnnualRainfall());
	   }
	   
   }
}
          