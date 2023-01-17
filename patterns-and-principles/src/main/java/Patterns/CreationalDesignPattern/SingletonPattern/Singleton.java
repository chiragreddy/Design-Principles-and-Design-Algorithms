package Patterns.CreationalDesignPattern.SingletonPattern;

public class Singleton{

	// Used when the class should only ever have one instance which can be accessible through out the application. Used with a static variable and static method.
	// useful in logging like for example getLogger in log4j library when you want to use same logger instance in different classes or when we want to access this through the application.
	
	// Private constructor is usually used in classes with only static members
	
	private static Singleton obj = null;
	
	private Singleton(){ // This prevents other classes from creating instances of this class. So, we can save resources and CPU time.
	}
	
	// Lazy Initialization
	public static Singleton getObjectLazy() {
		if(obj == null)
			return new Singleton();            // instance will be created only if we need it (Only in single threaded environments)
		return obj;
	}
	
	/*
	 * Eager Initialization - instance is created at the time of loading the
	 * class. Drawback is instance will be created even if we need it or not.
	 * Used when creating instance doesnt need large amount of time or resources
	 */	
	
	private static Singleton obj2 = new Singleton(); // created here
	
	public static Singleton getObjectEager() {
		return obj2;
	}
	
	
}