public class InsurancePolicies {
	protected String clientName;
	protected String policyId;
	protected int age;
	protected long mobileNumber;
	protected String emailId;
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
  }
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}										
	public InsurancePolicies(String clientName, String policyId, int age, long mobileNumber, String emailId) {
		super();
		this.clientName = clientName;
		this.policyId = policyId;
		this.age = age;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
	}
}