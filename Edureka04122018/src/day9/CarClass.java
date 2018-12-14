package day9;



public class CarClass extends MachineClass{
	
	String carEngineSize;
    
	public CarClass() {
		super(10);
		System.out.println("Car class constructor");
		engineSize=2000;
	}
	
	
	public void restart() {
		System.out.println("Restart car class");
	}
	
	public void reset() {
		System.out.println("Reset car class");
	}
	
	@Override
	public void startMachine() {
		System.out.println("I am in start method of car class");
	}

}
