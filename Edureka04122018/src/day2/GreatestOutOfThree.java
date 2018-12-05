package day2;

public class GreatestOutOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNumber, secondNumber, thirdNumber;
		firstNumber = 80;
		secondNumber = 60;
		thirdNumber = 100;
		if((firstNumber > secondNumber) && (firstNumber > thirdNumber)){
			System.out.println("First number is greater : "+ firstNumber);
		}else if((secondNumber > thirdNumber) && (secondNumber > firstNumber)) {
			System.out.println("Second number is greater : "+ secondNumber);
		}else if ((thirdNumber > firstNumber) && (thirdNumber > secondNumber)) {
			System.out.println(" Third number is Greater :"+ thirdNumber);
		}else {
			System.out.println("All are equal");
		}
		

	}

}
