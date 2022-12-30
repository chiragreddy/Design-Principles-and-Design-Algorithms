package Principles2.DependencyInversionPrinciple;

public class RecipientWithoutDI {

	// Here, the RecipientWithoutDI (high level class) is dependent on DeliveredPackageClass low level concrete class instead of abstraction
	
	DeliveredPackage deliveredPackage;
	
	public void main(String[] args) {
		deliveredPackage.assignPackage();
	}
	
}

