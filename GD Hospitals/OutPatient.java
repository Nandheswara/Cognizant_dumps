
public class OutPatient extends Patient{
    
    private double consultingFee;
    
    public OutPatient(String patientId, String patientName, long mobileNumber, String gender, double consultingFee) {
		super(patientId,patientName,mobileNumber,gender);
		this.consultingFee=consultingFee;
	}
    
	
    public double getConsultingFee() {
		return consultingFee;
	}

	public void setConsultingFee(double consultingFee) {
		this.consultingFee = consultingFee;
	}
	
	// Fill the code
	
	public double calculateTotalBill(double scanPay,double medicinalBill){
		// Fill the code
		double bill_amount;
		bill_amount=this.consultingFee+scanPay+medicinalBill;
		return bill_amount;
	}
}
