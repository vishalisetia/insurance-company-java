package customer;

public class Tester {
	
	public static void main(String[] args){
		
		calculateMonthlyPremiumForRegularCustomerValidInput();
		calculateMonthlyPremiumForRegularCustomerInvalidInput1();
		calculateMonthlyPremiumForRegularCustomerInvalidInput2();
		calculateMonthlyPremiumForPremiumCustomerValidInput();
		calculateMonthlyPremiumForPremiumCustomerInvalidInput1();
		calculateMonthlyPremiumForPremiumCustomerInvalidInput2();
		changePasswordValidInput();
		changePasswordInvalidInput1();
		changePasswordInvalidInput2();
	}
	
	public static void calculateMonthlyPremiumForRegularCustomerValidInput() {
		
		try{				
			RegularCustomer regularCustomer=new RegularCustomer(24000, "abcde123", "LIFE INSURANCE");
			System.out.println("Customer Id: " +regularCustomer.getCustomerId());
			System.out.println("Password: " +regularCustomer.getPassword());
			System.out.println("Policy: " +regularCustomer.getPolicy());
			System.out.println("Policy Amount: " +regularCustomer.getPolicyAmount());
			System.out.println("Total Premium Amount: "+regularCustomer.calculateMonthlyPremium());
			System.out.println();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println();
		}
	}
	
	public static void calculateMonthlyPremiumForRegularCustomerInvalidInput1() {
		
		try{				
			RegularCustomer regularCustomer=new RegularCustomer(24000, "abcde123", "INSURANCE");
			System.out.println("Customer Id: " +regularCustomer.getCustomerId());
			System.out.println("Password: " +regularCustomer.getPassword());
			System.out.println("Policy: " +regularCustomer.getPolicy());
			System.out.println("Policy Amount: " +regularCustomer.getPolicyAmount());
			System.out.println("Total Premium Amount: "+regularCustomer.calculateMonthlyPremium());
			System.out.println();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println();
		}
	}
	
	
	public static void calculateMonthlyPremiumForRegularCustomerInvalidInput2() {
		
		try{				
			RegularCustomer regularCustomer=new RegularCustomer(26000, "abcde123", "HEALTH INSURANCE");
			System.out.println("Customer Id: " +regularCustomer.getCustomerId());
			System.out.println("Password: " +regularCustomer.getPassword());
			System.out.println("Policy: " +regularCustomer.getPolicy());
			System.out.println("Policy Amount: " +regularCustomer.getPolicyAmount());
			System.out.println("Total Premium Amount: "+regularCustomer.calculateMonthlyPremium());
			System.out.println();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println();
		}
	}
	
	public static void calculateMonthlyPremiumForPremiumCustomerValidInput() {
		
		try{	
			String[] policies={"VEHICLE INSURANCE","LIFE INSURANCE"};
			PremiumCustomer PremiumCustomer=new PremiumCustomer(28000, "ABcd123", policies);
			System.out.println("Customer Id: " +PremiumCustomer.getCustomerId());
			System.out.println("Password: " +PremiumCustomer.getPassword());
			System.out.println("Policies: ");
			for(String policy: policies)
				System.out.println(policy);
			System.out.println("Policy Amount: " +PremiumCustomer.getPolicyAmount());
			System.out.println("Total Premium Amount: "+PremiumCustomer.calculateMonthlyPremium());
			System.out.println();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println();
		}
	}
	
	public static void calculateMonthlyPremiumForPremiumCustomerInvalidInput1() {
		
		try{	
			String[] policies={"LIFE INSURANCE","HEALTH INSURANCE","INSURANCE"};
			PremiumCustomer PremiumCustomer=new PremiumCustomer(44000, "abcde123", policies);
			System.out.println("Customer Id: " +PremiumCustomer.getCustomerId());
			System.out.println("Password: " +PremiumCustomer.getPassword());
			System.out.println("Policies: ");
			for(String policy: policies)
				System.out.println(policy);
			System.out.println("Policy Amount: " +PremiumCustomer.getPolicyAmount());
			System.out.println("Total Premium Amount: "+PremiumCustomer.calculateMonthlyPremium());
			System.out.println();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println();
		}
	}
	
	public static void calculateMonthlyPremiumForPremiumCustomerInvalidInput2() {
		
		try{	
			String[] policies={"LIFE INSURANCE","HEALTH INSURANCE"};
			PremiumCustomer PremiumCustomer=new PremiumCustomer(24000, "abcde123", policies);
			System.out.println("Customer Id: " +PremiumCustomer.getCustomerId());
			System.out.println("Password: " +PremiumCustomer.getPassword());
			System.out.println("Policies: ");
			for(String policy: policies)
				System.out.println(policy);
			System.out.println("Policy Amount: " +PremiumCustomer.getPolicyAmount());
			System.out.println("Total Premium Amount: "+PremiumCustomer.calculateMonthlyPremium());
			System.out.println();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println();
		}
	}
	
	public static void changePasswordValidInput() {
		
		try{
			RegularCustomer regularCustomer=new RegularCustomer(24000, "abcde123", "LIFE INSURANCE");
			if(regularCustomer.changePassword("abcde123", "abcd123"))
				System.out.println("The password has been changed successfully!");
			else
				System.out.println("The password could not be changed!");
			System.out.println();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println();
		}
	}
	
	public static void changePasswordInvalidInput1() {
		
		try{
			RegularCustomer regularCustomer=new RegularCustomer(24000, "abcde123", "LIFE INSURANCE");
			if(regularCustomer.changePassword("uvwxyz123", "abcd123"))
				System.out.println("The password has been changed successfully!");
			else
				System.out.println("The password could not be changed!");
			System.out.println();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println();
		}
	}
	
	public static void changePasswordInvalidInput2() {
		
		try{
			String[] policies={"LIFE INSURANCE","HEALTH INSURANCE"};
			PremiumCustomer PremiumCustomer=new PremiumCustomer(44000, "abcde123", policies);
			if(PremiumCustomer.changePassword("abcde123", "abcd12345"))
				System.out.println("The password has been changed successfully!");
			else
				System.out.println("The password could not be changed!");
			System.out.println();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println();
		}
	}	
}