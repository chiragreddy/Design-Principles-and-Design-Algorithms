package Principles2.InterfaceSegregationPrinciple;

public interface HotBeverageMachine extends VendingMachineWithISP{

	void brewCoffee();
	void brewHotChocolate();
	void brewTea();
	
}
