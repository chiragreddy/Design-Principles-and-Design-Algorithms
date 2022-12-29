package Principles2.InterfaceSegregationPrinciple;

public interface VendingMachineWithoutISP {

	// Interface segregation principle - classes should not be forced to use methods that they don't use 
	// ISP: The caller shouldn't depend on more of the base type's interface than it needs.
	
	void takeMoney(); 
	void brewCoffee(); // used by hot beverage machine
	void brewHotChocolate(); // used by hot beverage machine
	void brewTea(); // used by hot beverage machine
	void dispenseWater(); // used by cold beverage machine
	void dispenseSoda(); // used by cold beverage machine
	void dispenseSnack(); // used by snack machine
	 
}
