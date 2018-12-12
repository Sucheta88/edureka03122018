package day8;

public class CarClass extends MachineClass{
	
	String carEngineSize;
	public CarClass() {
		super(10);
		System.out.println("Car class constructor");
	}
	
	public void restart() {
		System.out.println("Restart car class");
	}
	
	public void reset() {
		System.out.println("Reset car class");
	}

}
