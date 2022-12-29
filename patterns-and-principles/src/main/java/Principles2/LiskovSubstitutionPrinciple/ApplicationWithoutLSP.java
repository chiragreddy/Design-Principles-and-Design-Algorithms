package Principles2.LiskovSubstitutionPrinciple;

public class ApplicationWithoutLSP {

	// Liskov Substitution Principle - we should always be able to substitute Super Types/Base Types with Sub Type class without affecting the functionality. It defines the class heirarchies
	// What's true about super class (i.e. methods) has to be applicable about all the sub classes or else it violates the LSP. This is where we use the design by contract theory where we make sure that the sub class has to adhere to the contract
	
	//	LSP: The subclass must honor the contracts it promises.
	
	public static void main(String[] args) {
		
		Recipient cdadRecipient = new CDAD();
		cdadRecipient.registerApplicationWithBasicRecipient();
		cdadRecipient.registerApplicationWithTailRecipient();       // Should not be allowed
		
		Recipient cdafRecipient = new CDAF();
		cdafRecipient.registerApplicationWithBasicRecipient();      // Should not be allowed
		cdafRecipient.registerApplicationWithTailRecipient();
		
	}
	
}
