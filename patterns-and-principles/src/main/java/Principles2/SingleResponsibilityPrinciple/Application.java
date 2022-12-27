package Principles2.SingleResponsibilityPrinciple;

public class Application extends Recipient{

	/*
	 * An class should have one and only one responsibility. You don’t need to have
	 * an object that does different or many tasks(methods). An object can have many
	 * behaviors and methods, but all of them are relevant to it’s single
	 * responsibility. So, whenever there is a change that needs to happen, there
	 * will be only one class to be modified, this class has one primary
	 * responsibility. Only separate the methods into a different class only if we know the code changes in those methods.
	 */
	Recipient recipient;
	
	public void Application() {
		
		recipient.createBasicRecipient();
		recipient.processTailRecipient();
		
	}
	
	// basicrecip, tail recip, recip interface basic recip
	
}