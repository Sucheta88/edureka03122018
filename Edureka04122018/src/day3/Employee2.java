package day3;

public class Employee2 {
	private int salary;
	private int bonus;	
	
	public void setSalary(int salary) {
		if(salary >=0) {
		this.salary = salary;
		//System.out.println("Salary is : "+ salary);
		}
		else {
			System.out.println("Invalid salary");
		}
	}
	
	public int getSalary() {
		return salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		if(bonus >=0) {
		this.bonus = bonus;
		//System.out.println("Bonus is : "+ bonus);
		}
		else {
			System.out.println("Invalid Bonus");
		}
	}
     
	int calculateSalary1() {
		int totalSalary = salary + bonus;
		return totalSalary;
	}
	
		
}
