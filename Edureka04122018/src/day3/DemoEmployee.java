package day3;

public class DemoEmployee {

	public static void main(String[] args) {
	 Employee sucheta = new Employee();
	 sucheta.salary=50000;
	 sucheta.bonus=4000;
	 int salary = sucheta.calculateSalary1();
	 System.out.println("Salary of Sucheta is : "+ salary);
	 System.out.println("------------------------------------");
	 Employee munish = new Employee();
	 munish.salary= 80000;
	 munish.bonus= 9000;
	int munishSalary = munish.calculateSalary3(85000, 6000);
	System.out.println("Salary of Munish : "+ munishSalary);
	System.out.println("-------------------------------------------");
	
	Employee rishaan = new Employee(30000,2000);
	rishaan.calculateSalary();

	}

}
