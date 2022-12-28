package Principles2.OpenClosedPrinciple;

public class MainClass{

	static // Classes should be open for extension but not for modification
	// Assume we have a recipient interface with a createRecipient method and we can add more number of recipients like basic, proxy, tail at any time.
	
	Recipient basicRecipient;   // Using Composition Over Inheritance principle instead of inheriting/implementing the Recipient abstract class/interface
	// Now, if we want to add new types of recipients, instead of modifying the same recipient interface(where we add a createRecipient method for tail recipient), we can create a new tail recipient class and add the create recipient method
	Recipient tailRecipient;
	
	public static void main(String[] args) {
	
		basicRecipient.createRecipient("BasicRecipName1");
	
	}
	
}