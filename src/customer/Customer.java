package customer;

//DO NOT MODIFY THE CODE PROVIDED TO YOU
public abstract class Customer {
	
	private int customerId;
	private String password;
	private double policyAmount;
	private static int idCounter;
	
	static {
		idCounter=1001;
	}
	
	public Customer(double policyAmount, String password){
		this.setCustomerId(idCounter++);
		this.policyAmount=policyAmount;
		this.password=password;
	}

	public abstract double calculateMonthlyPremium() throws InvalidPolicyDetailsException;
	
	public int calculateServiceCharge(String policy){
		int serviceCharge = 0;
		if(policy=="HEALTH INSURANCE")
		{
			serviceCharge = 10;
		}
		else if(policy=="LIFE INSURANCE")
		{
			serviceCharge = 15;
		}
		else if(policy=="TRAVEL INSURANCE")
		{
			serviceCharge = 20;
		}
		else if(policy=="VEHICLE INSURANCE")
		{
			serviceCharge = 25;
		}
		else
		{
			serviceCharge = -1;
		}
		return serviceCharge; 
	}
	
	public boolean changePassword(String oldPassword, String newPassword){
		if(this.password==oldPassword)
		{
			if(newPassword.matches("[a-zA-Z]{4,}[0-9]{3}")) 
			{
				setPassword(newPassword);
				return true;
			}
		}
		return false;
	}
		
	public int getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(int customerId) {
		//Implement your code here
		this.customerId=customerId;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		//Implement your code here
		this.password=password;
	}
	
	public double getPolicyAmount() {
		return policyAmount;
	}
	
	public void setPolicyAmount(double policyAmount) {
		//Implement your code here
		this.policyAmount=policyAmount;
	}
	
	public static int getIdCounter() {
		return idCounter;
	}
	
	public static void setIdCounter(int idCounter) {
		//Implement your code here
		Customer.idCounter=idCounter;
	}
	
}