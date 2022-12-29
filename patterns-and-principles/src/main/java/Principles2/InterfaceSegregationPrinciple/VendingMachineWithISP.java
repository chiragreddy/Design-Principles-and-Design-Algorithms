package Principles2.InterfaceSegregationPrinciple;

public interface VendingMachineWithISP {

	/*
	 * Interfaces should be cohesive and maintained such that the interfaces
	 * should not have unwanted methods they don't use // similar to the fact that
	 * coldBeverageMachine type doesn't need dispenseSnack method or else making a
	 * change in the VendingMachineWithoutISP Interface will affect all the three
	 * classes (if all classes use the same interface)
	 */	
	
	void takeMoney();
	
}
