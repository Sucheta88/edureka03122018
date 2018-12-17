package da11;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

	@Test(dataProvider = "getTestData")
	public void printTestData(String userName, String password) {
		System.out.println("Username is :" + userName + " , Password is " + password);
	}

	@Test(dataProvider = "getMultipleTestData")
	public void printTestData(String userName, int id) {
		System.out.println("Username is :" + userName + " , Id is : " + id);
	}

	@DataProvider
	public Object[][] getMultipleTestData() {
		Object[][] data = new Object[4][2];
		data[0][0] = "Sucheta";
		data[0][1] = 757;
		data[1][0] = "Rishaan";
		data[1][1] = 8485;
		data[2][0] = "Munish";
		data[2][1] = 94573;
		data[3][0] = "Rahul";
		data[3][1] = 948;

		return data;

	}

	@DataProvider
	public String[][] getTestData() {
		String[][] data = new String[4][2];
		data[0][0] = "Sucheta";
		data[0][1] = "abc#ywu";
		data[1][0] = "Rishaan";
		data[1][1] = "@ab12";
		data[2][0] = "Munish";
		data[2][1] = "abc@123";
		data[3][0] = "Rahul";
		data[3][1] = "dghr@34";

		return data;

	}
}
