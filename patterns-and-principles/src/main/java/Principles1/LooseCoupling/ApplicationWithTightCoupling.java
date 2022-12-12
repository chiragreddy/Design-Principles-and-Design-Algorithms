package Principles1.LooseCoupling;

public class ApplicationWithTightCoupling {

	// Objects should be independent and should rely on other objects as less as possible so that changes to one class doesnt affect the other
	// Similar to Observer Pattern
	// Application calling createRecipient method of Basic Recipient cass which is composed with tight coupling
	BasicRecipient basicRecipient;        //Composition - application has to have a recipient in the application
	public void downloadPackage() {
		createPackage();
		basicRecipient.createRecipient();
		
	}
	
	public void sendPackageToDest() {
		sendPackage();
	}
	
}