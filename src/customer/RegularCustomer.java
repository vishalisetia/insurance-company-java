package customer;

//DO NOT MODIFY THE CODE PROVIDED TO YOU
public class RegularCustomer extends Customer {
	
	private String policy;
	
	public RegularCustomer(double policyAmount,String password,String policy){
		//Implement your code here
		super(policyAmount, password);
		this.policy=policy;
	}

	@Override
	public double calculateMonthlyPremium() throws InvalidPolicyDetailsException {		
		//Implement your code and change the return statement accordingly
		int processingFee=0;
		double totalMonthlyPremiumAmount=0.0;
		if(getPolicyAmount()<=25000)
		{
			processingFee=250;
		int serviceChargePercentage=calculateServiceCharge(getPolicy());
		if(serviceChargePercentage==-1)
		{
			throw new InvalidPolicyDetailsException("Invalid Policy");
		}
		else
		{
		double serviceCharge=((getPolicyAmount()/12)+processingFee)*serviceChargePercentage/100;
		totalMonthlyPremiumAmount=(getPolicyAmount()/12)+processingFee+serviceCharge;
		}
		}
		else if(getPolicyAmount()>25000)
		{
			throw new InvalidPolicyDetailsException("Invalid Amount");
		}
		return Math.round(totalMonthlyPremiumAmount);
	}
	
	public String getPolicy() {
		return policy;
	}
	
	public void setPolicy(String policy) {
		//Implement your code here
		this.policy=policy;
	}
}