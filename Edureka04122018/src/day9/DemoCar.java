package day9;

public class DemoCar {

	public static void main(String[] args) {
		MachineClass mc = new MachineClass();
		mc.startMachine();
		mc.StopMachine();
	    mc.engineSize=1000;
		System.out.println("------------------------------");
		CarClass alto = new CarClass();
		alto.startMachine();
		alto.StopMachine();
		alto.restart();
		alto.reset();
		System.out.println("------------------------------");
		MachineClass Fordfigo = new CarClass();
		Fordfigo.startMachine();
		Fordfigo.StopMachine();

	}

}
