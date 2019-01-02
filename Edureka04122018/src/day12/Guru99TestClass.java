package day12;

public class Guru99TestClass {
	public void invokeBrowser() {
		System.out.println("Invoke Browser");
	}

	public void logIn() throws ArrayIndexOutOfBoundsException,Exception{
		int[] arr = new int[5];
		    arr[0] = 50;
			arr[1] = 70;
			arr[2] = 67;
			arr[3] = 24;
			arr[4] = 10;

			for (int i = 0; i <= 5; i++) {
				System.out.println(arr[i]);
			}
		System.out.println("User Login");
	}

	public void addUser() {
		System.out.println("Add new user");
	}

	public void logout() {
		System.out.println("Logout from application");
	}

	public void closeBrowser() {
		System.out.println("Closes browser");
	}
}
