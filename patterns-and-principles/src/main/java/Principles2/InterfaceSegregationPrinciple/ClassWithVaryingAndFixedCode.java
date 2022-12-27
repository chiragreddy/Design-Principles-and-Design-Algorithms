package Principles1.EncapsulateWhatVaries;

public class ClassWithVaryingAndFixedCode {
	
	// Used in almost all design patterns - Encapsulate code which keeps changing from the code that remains same .e.g. Simple Factory Pattern
	// Device types - Basic, Tail, Proxy 
	
	public ReviewDevice processReviewDevice(String deviceType) {
		ReviewDevice reviewDevice;
		
		if(deviceType.equals("Basic"))                     // Varying code as we can add or remove existing review devices. Hence, move this into a factory class
			reviewDevice =  new BasicReviewDevice();       // Assuming Basic, Tail and ProxyReviewDevice extend from ReviewDevice Class
		else if(deviceType.equals("Tail"))
			reviewDevice =  new TailReviewDevice();
		else if(deviceType.equals("Proxy"))
			reviewDevice = new ProxyReviewDevice();
		
		reviewDevice.receivePackageFromCheckpoint();       // fixed code which is common for all review devices
		reviewDevice.downloadPackage();
		reviewDevice.ApproveOrRejectPackage();
		reviewDevice.sendPackageToRecipient();
		
		return reviewDevice;
		
	}
	
}