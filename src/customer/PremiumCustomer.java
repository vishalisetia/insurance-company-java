package customer;

//DO NOT MODIFY THE CODE PROVIDED TO YOU
public class PremiumCustomer extends Customer {
	
	private final long MEMBERSHIP_FEE = 1000;
	private String[] policyList;
	
	public PremiumCustomer(double policyAmount, String password, String[] policyList) {
		//Implement your code here
		super(policyAmount, password);
		this.policyList=policyList;
	}
	
	@Override
	public double calculateMonthlyPremium() throws InvalidPolicyDetailsException {		
		//Implement your code and change the return statement accordingly
		double totalPolicyAmount=0;
		double totalMonthlyPremiumAmount=0.0;
		for(String i:policyList)
		{
			if(i=="HEALTH INSURANCE")
			{
				totalPolicyAmount+=24000.0;
			}
			else if(i=="LIFE INSURANCE")
			{
				totalPolicyAmount+=20000.0;
			}
			else if(i=="VEHICLE INSURANCE")
			{
				totalPolicyAmount+=8000.0;
			}
			else if(i=="TRAVEL INSURANCE")
			{
				totalPolicyAmount+=10000.0;
			}
		
	}
	  if(totalPolicyAmount!=getPolicyAmount())
	 {
		  throw new InvalidPolicyDetailsException("Invalid Amount");
	 }
	  else
	  {
		 for (String i:policyList)
		 {
			 int serviceChargePercentage=calculateServiceCharge(i);
				if(serviceChargePercentage==-1)
				{
					throw new InvalidPolicyDetailsException("Invalid Policy");
				} 
				else
				{
					double d=0.0;
					if(i=="HEALTH INSURANCE")
					{
						d=24000.0;
					}
					else if(i=="LIFE INSURANCE")
					{
						d=20000.0;
					}
					else if(i=="VEHICLE INSURANCE")
					{
						d=8000.0;
					}
					else if(i=="TRAVEL INSURANCE")
					{
						d=10000.0;
					}
					double serviceCharge=(d/12)*serviceChargePercentage/100;
					 totalMonthlyPremiumAmount+=serviceCharge;
				}
		 }
	  }
	  double s=(getPolicyAmount()/12)+totalMonthlyPremiumAmount+MEMBERSHIP_FEE;
		return Math.round(s);
	}

	public String[] getPolicyList() {
		return policyList;
	}
	
	public void setPolicyList(String[] policyList) {
		//Implement your code here
		this.policyList=policyList;
	}
	
}
