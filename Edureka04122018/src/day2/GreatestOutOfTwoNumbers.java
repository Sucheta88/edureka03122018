package day2;

public class GreatestOutOfTwoNumbers {

	public static void main(String[] args) {
		int firstNumber, secondNumber;
		firstNumber = 45;
		secondNumber = 45;
		if(firstNumber > secondNumber) {
			System.out.println("First Number is greatest : "+ firstNumber);
			
		}
		else if(firstNumber < secondNumber) {
			System.out.println("Second Number is greatest : "+ secondNumber);
			
		}
		else {
			System.out.println("All are equal");
		}

	}

}
