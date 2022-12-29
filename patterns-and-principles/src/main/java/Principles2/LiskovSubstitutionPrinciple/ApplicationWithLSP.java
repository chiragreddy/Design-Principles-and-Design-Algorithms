package Principles2.LiskovSubstitutionPrinciple;

public class ApplicationWithLSP {

	// Liskov Substitution Principle - we should always be able to substitute Super Types/Base Types with Sub Type class without affecting the functionality. 
	// It defines the class heirarchies
	// All behaviors of super class must be applicable for the subclass or else we substitute the super class with sub class. 
	// This is where we use the design by contract theory where we make sure that the sub class has to adhere to the contract
	
	// LSP: The subtype must honor the contracts it promises.

	public static void main(String[] args) {
		
//		IRecipient cdadRecipient = new CDADWithLSP();
		CDADWithLSP cdadRecipient = new CDADWithLSP();        // Here, we substituted IRecipient super type with sub class CDADWithLSP
		cdadRecipient.registerApplicationWithBasicRecipient();
		cdadRecipient.sendDataToDestination("CDAD");
		
		
		CDAFWithLSP cdafRecipient = new CDAFWithLSP();
		cdafRecipient.registerApplicationWithTailRecipient(); // Here, we substituted IRecipient super type with subclass CDAFWithLSP
		cdafRecipient.sendDataToDestination("CDAF");
		
	}
	
}
