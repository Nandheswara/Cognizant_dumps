public class SeniorCitizenPolicy extends InsurancePolicies{

	public SeniorCitizenPolicy(String clientName, String policyId, int age, long mobileNumber, String emailId) {
		super(clientName, policyId, age, mobileNumber, emailId);
	}
	public boolean validatePolicyId()
	{
		int count=0;
		if(policyId.contains("SENIOR"));
		count++;
		char ch[]=policyId.toCharArray();
		for(int i=6;i<9;i++)
		{
			if(ch[i]>='0' && ch[i]<='9')
			count++;
		}
		if(count==4)
			return true;
		else 
			return false;
	}
	
	 public double calculateInsuranceAmount(int months, int no_of_members)
	 {
		 double amount=0;
		 if(age>=5 && age<60)
			 amount=0;
		 else if (age>=60)
			 amount=10000*months*no_of_members;
		 return amount;
	 }

   }




