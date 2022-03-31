import java.util.Scanner;

public class UserInterface {
	
	public static void main(String[] args){
		Scanner read=new Scanner(System.in);
		
		System.out.println("1.In Patient");
		System.out.println("1.Out Patient");
		System.out.println("Enter the choice");
		int ch=read.nextInt();
		System.out.println("Enter the details");
		System.out.println("Patient Id");
		String id=read.nextLine();
		System.out.println("Patient Name");
		String name=read.nextLine();
		read.nextLine();
		System.out.println("Phone Number");
		long num=read.nextLong();
		System.out.println("Gender");
		String gen=read.next();
		
		if(ch==1){
		    
		    System.out.println("Room Rent");
		    double rent=read.nextDouble();
		    InPatient in=new InPatient(id,name,num,gen,rent);
		    System.out.println("Medicinal Bill");
		    double bill=read.nextDouble();
		    System.out.println("Number of Days of Stay");
		    int days=read.nextInt(); 
		    System.out.println("Amount to be paid "+in.calculateTotalBill(days,bill));
		}
		
		else{
		    
		    System.out.println("Consultancy Fee");
		    double fee=read.nextDouble();
		    OutPatient out=new OutPatient(id,name,num,gen,fee);
		    System.out.println("Medicinal Bill");
		    double medbill=read.nextDouble();
		    System.out.println("Scan Pay");
		    double pay=read.nextDouble(); 
		    System.out.println("Amount to be paid "+out.calculateTotalBill(pay,medbill));

		}
		// Fill the code
	}
}
