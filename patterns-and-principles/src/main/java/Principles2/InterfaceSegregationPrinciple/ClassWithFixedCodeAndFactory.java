package Principles1.EncapsulateWhatVaries;

import org.springframework.beans.factory.annotation.Autowired;

public class ClassWithFixedCodeAndFactory {

	@Autowired
	FactoryClassWithVaryingCode factoryClass;
	
	public ReviewDevice processReviewDevice(String deviceType) {
		
		ReviewDevice reviewDevice = factoryClass.createReviewDevice(deviceType);
		
		reviewDevice.receivePackageFromCheckpoint();       // fixed code which is common for all review devices
		reviewDevice.downloadPackage();
		reviewDevice.ApproveOrRejectPackage();
		reviewDevice.sendPackageToRecipient();
		
		return reviewDevice;
		
	}
	
}
