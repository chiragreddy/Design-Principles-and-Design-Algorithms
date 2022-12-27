package Principles2.SingleResponsibilityPrinciple;

public class ApplicationWithSingleResponsibility{

	/*
	 * The application can now call methods of create and processrecipient
	 * individually and we only separate them into different classes/interfaces when
	 * we know that one part(create/processrecipient) changes often BECAUSE when
	 * there is a change in one class, only that class needs to be modified and it
	 * should not impact more classes (i.e.if changes in createRecipient methods
	 * affect processRecipient methods or viceversa, then they need to be separated.
	 */
	
	createRecipient createRecipient;
	processRecipient processRecipient;
	
	public void Application() {
		
		createRecipient recip1 = new createRecipientImpl();
		processRecipient recip2 = new processRecipientImpl();
		
		recip1.createBasicRecipient();
		recip2.processTailRecipient();
		
	}
	
}