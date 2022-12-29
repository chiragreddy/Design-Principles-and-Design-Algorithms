package Principles2.LiskovSubstitutionPrinciple;

public class CDAD extends Recipient{

	// Assume CDAD is something which can be installed on a desktop
	// However, assume CDAD only supports BasicRecipients, so it doesnt need  registerApplicationWithTailRecipient method
	
	public void sendDataToDestination(String destination) { // we can change this method impl by changing destination assuming rest of impl is same
		
	}
	
	@Override
	void registerApplicationWithBasicRecipient() { // Applicable for CDAD
		// TODO Auto-generated method stub
		
	}

	@Override
	void registerApplicationWithTailRecipient() { // Not Applicable for CDAD
		// TODO Auto-generated method stub
		
	}

	//
	
}
