public class FamilyInsurancePolicy extends InsurancePolicies{
	
	public FamilyInsurancePolicy(String clientName, String policyId, int age, long mobileNumber, String emailId) {
		super(clientName, policyId, age, mobileNumber, emailId);
		
	}

	public boolean validatePolicyId()
	{
		int count=0;
		if(policyId.contains("FAMILY"));
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
		 if(age>=5 && age<=25)
			 amount=2500*months*no_of_members;
		 else if (age>25 && age<60)
			 amount=5000*months*no_of_members;
		 else if (age>=60)
			 amount=10000*months*no_of_members;
		 return amount;
	 }

    }
