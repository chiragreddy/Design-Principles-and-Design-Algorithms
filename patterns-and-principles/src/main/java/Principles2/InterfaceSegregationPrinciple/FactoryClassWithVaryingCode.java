package Principles1.EncapsulateWhatVaries;
import org.springframework.stereotype.Component;

@Component
public class FactoryClassWithVaryingCode {

	public ReviewDevice createReviewDevice(String deviceType) {
		
		ReviewDevice reviewDevice = null;
		
		if(deviceType.equals("Basic"))                     // Varying code in the FactoryClass
			reviewDevice =  new BasicReviewDevice();
		else if(deviceType.equals("Tail"))
			reviewDevice =  new TailReviewDevice();
		else if(deviceType.equals("Proxy"))
			reviewDevice = new ProxyReviewDevice();
		
		return reviewDevice;
		
		
	}
	
}