package Principles1.CompositionOverInheritance;

public class Consumer {

	public String getCode() {
		return null;
	}

	public void setCode(String code) {
		// TODO Auto-generated method stub
		
	}

	public String getName() {
		return "COM";
	}

	public void setName(String name) {
		
	}
	
}

class AirIndia extends Consumer{
	
	// all methods are inherited
		public String getName() {
			return "AIR";
		}
	
}

class AirChina extends Consumer{
	
	// all methods are inherited
	public String getName() {
		return "AIC";
	}
	
}

class Qatar extends Consumer{
	
	// all methods are inherited
	public String getName() {
		return "QTR";
	}
	
}