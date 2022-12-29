package Principles2.LiskovSubstitutionPrinciple;

public interface IRecipient {

	// using interface instead of an abstract class
	
	void sendDataToDestination(String destination);
	
}
