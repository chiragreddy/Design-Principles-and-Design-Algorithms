package Principles2.DependencyInversionPrinciple;

public class RecipientWithDI {

	/*
	 * Dependency Inversion - High level classes should not depend on low level
	 * classes rather it should depend on abstractions // Here, the RecipientWithDI
	 * is dependent on abstraction/interface instead of concrete class i.e. the low
	 * level concrete Delivered Package class is now dependent on high level class - Package
	 */	
	
	Package deliveredPackage;
	public void main(String[] args) {
		deliveredPackage.assignPackage();
	}
	
}

