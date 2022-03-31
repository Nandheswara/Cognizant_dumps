public class IndividualInsurancePolicy extends InsurancePolicies{
	
	public IndividualInsurancePolicy(String clientName, String policyId, int age, long mobileNumber, String emailId) {
		super(clientName, policyId, age, mobileNumber, emailId);
		
	}

	public boolean validatePolicyId()
	{
		int count=0;
		if(policyId.contains("SINGLE"));
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
	
	 public double calculateInsuranceAmount(int months)
	 {
		 double amount=0;
		 if(age>=5 && age<=25)
			 amount=2500*months;
		 else if (age>25 && age<60)
			 amount=5000*months;
		 else if (age>=60)
			 amount=10000*months;
		 return amount;
	 }

   }