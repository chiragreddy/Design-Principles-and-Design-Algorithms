package Principles2.LiskovSubstitutionPrinciple;

public abstract class Recipient {

	// Context here is CDAD and CDAF are recipients and they should be registered with basic/tail recipients on the application server side to send data to destination
	
	public void sendDataToDestination(String destination) {
		
	}
	
	abstract void registerApplicationWithBasicRecipient();
	
	abstract void registerApplicationWithTailRecipient();
	
}
