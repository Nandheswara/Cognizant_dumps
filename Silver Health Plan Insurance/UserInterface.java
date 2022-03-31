import java.util.Scanner;

     public class UserInterface {
	
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Client name");
		String name=sc.next();
		System.out.println("Enter Policy Id");
		String id=sc.next();
		System.out.println("Enter Client age");
		int age=sc.nextInt();
		System.out.println("Enter mobile number");
		long mnum=sc.nextLong();
		System.out.println("Enter Email Id");
		String email=sc.next();
		
		InsurancePolicies policy=new InsurancePolicies(name,id,age,mnum,email);
		System.out.println("Enter the months");
		int month=sc.nextInt();
		
		double amount=0;
		if(id.contains("SINGLE"))
		{
			IndividualInsurancePolicy g=new IndividualInsurancePolicy(name,id,age,mnum,email);
			if(g.validatePolicyId())
			{
				//System.out.println(g.validatePolicyId());
				amount=g.calculateInsuranceAmount(month);
				System.out.println("Name :"+name);
				System.out.println("Email Id :"+email);
				System.out.println("Amount to be paid :"+amount);
			}
			else
			{										
				System.out.println("Provide valid Policy Id");
			}
		}
		else if(id.contains("FAMILY"))
		{
			FamilyInsurancePolicy g=new FamilyInsurancePolicy(name,id,age,mnum,email);
			if(g.validatePolicyId())
			{
				System.out.println("Enter number of members");
				int num=sc.nextInt();
				amount=g.calculateInsuranceAmount(month,num);
				System.out.println("Name :"+name);
				System.out.println("Email Id :"+email);
				System.out.println("Amount to be paid :"+amount);				
			}
			else
			{
				System.out.println("Provide valid Policy Id");
			}
		}
		else if(id.contains("SENIOR"))
		{
			SeniorCitizenPolicy g=new SeniorCitizenPolicy(name,id,age,mnum,email);
			if(g.validatePolicyId())
			{
				System.out.println("Enter number of members");
				int num=sc.nextInt();
				amount=g.calculateInsuranceAmount(month,num);
				System.out.println("Name :"+name);
				System.out.println("Email Id :"+email);
				System.out.println("Amount to be paid :"+amount);
			}
			else
			{
				System.out.println("Provide valid Policy Id");
			}										
		}
		else
			System.out.println("Provide valid Policy Id");
	}
	
	
    }														






