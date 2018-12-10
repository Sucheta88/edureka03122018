package day5;

public class DemoGuru99Project {

	public static void main(String[] args) {
		Guru99Project gp = new Guru99Project();
		gp.inVokeBrowser();
		gp.logIn("mngr166884", "h5@hdh");
		gp.addCustomer();
	String customerID =	gp.getCustomerID();
	System.out.println("Customer Id is : "+ customerID);
	gp.addNewAccount(customerID);
		//gp.changePassword();
		//gp.closeBrowser();

	}

}
