
public class InPatient extends Patient{
    
    private double roomRent;
    
    public InPatient(String patientId, String patientName, long mobileNumber, String gender, double roomRent) {
		super(patientId,patientName,mobileNumber,gender);
		this.roomRent=roomRent;
	}
    
	public double getRoomRent() {
		return roomRent;
	}

	public void setRoomRent(double roomRent) {
		this.roomRent = roomRent;
	}
	
	// Fill the code
	
	public double calculateTotalBill(int noOfDays,double medicinalBill){
		// Fill the code
		double bill_amount;
		bill_amount=((this.roomRent*noOfDays)+medicinalBill);
		return bill_amount;
	}

}
