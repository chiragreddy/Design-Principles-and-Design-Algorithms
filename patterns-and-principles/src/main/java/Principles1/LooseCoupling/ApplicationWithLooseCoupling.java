package Principles1.LooseCoupling;

public class ApplicationWithLooseCoupling {

	/*
	 * Application calling createRecipient method of Basic Recipient class which is
	 * composed with tight coupling Now the application can only call
	 * createRecipient method for loose coupling and we can add any number of
	 * recipients(Basic, Tail, Proxy) which implement the recipient class having its
	 * own createRecipient method. Also, now changing the recipient implementation
	 * would not affect the application
	 */
	
	Recipient recipient;
	public void downloadPackage() {
		createPackage();
		recipient.createRecipient();
			
	}
		
	public void sendPackageToDest() {
		sendPackage();
	}	
	
}
