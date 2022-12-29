package Principles2.LiskovSubstitutionPrinciple;

public class CDAF extends Recipient{

	// Assume CDAF is something which can be installed on a EFB
	// However, assume CDAF only supports TailRecipients, so it doesnt need  registerApplicationWithBasicRecipient method 
	
	public void sendDataToDestination(String destination) {  // we can change this method impl by changing destination assuming rest of impl is same
		
	}
	
	@Override
	void registerApplicationWithBasicRecipient() { // Not applicable for CDAF
		// TODO Auto-generated method stub
		
	}

	@Override
	void registerApplicationWithTailRecipient() { // Applicable for CDAF
		// TODO Auto-generated method stub
		
	}

}
