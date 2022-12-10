package Principles1.CompositionOverInheritance;

public interface Company {
	
	// Inheritance is tightly coupled whereas composition is loosely coupled
	// Relationship - e.g. One Company can have multiple consumers, One Company can have multiple Suppliers, Package has ContentType
	// Suppose Company A is supplier and companies B, C and D are consumers
	
	String getCode();
	void setCode(String code);
	String getName();
	void setName(String name);
	boolean isHosted();
	
}