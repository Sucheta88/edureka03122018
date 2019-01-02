package day12;

public class DemoGuru99Class {

	public static void main(String[] args) {
		Guru99TestClass gc = new Guru99TestClass();
		try {
			gc.invokeBrowser();
			gc.logIn();
			gc.addUser();
			gc.logout();
		} catch (ArrayIndexOutOfBoundsException ex) {
			// TODO: handle exception
		}
		catch (Exception e) {
			// TODO: handle exception
		}finally {
			gc.closeBrowser();
		}
		

	}

}
