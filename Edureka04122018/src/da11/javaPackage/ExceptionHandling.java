package da11.javaPackage;

public class ExceptionHandling {
	public static void main(String[] args) {
		int[] arr = new int[5];
		try {
			arr[0] = 50;
			arr[1] = 70;
			arr[2] = 67;
			arr[3] = 24;
			arr[4] = 10;

			for (int i = 0; i <= 5; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Array index out of bound exception");
		}

		System.out.println("After exception execution");
	}

}
