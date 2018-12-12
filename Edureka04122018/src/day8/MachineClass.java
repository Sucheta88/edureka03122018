package day8;

public class MachineClass {
	

	public MachineClass() {
		System.out.println("Mchine constructor");
	}
	
	public MachineClass(int engineSize) {
		this.engineSize = engineSize;
		System.out.println("Machine constructor");
	}
	
	 int engineSize;
	public void startMachine() {
		System.out.println("Start the machine");
	}
	
	public void StopMachine() {
		System.out.println("Stop the machine");
	}

}
