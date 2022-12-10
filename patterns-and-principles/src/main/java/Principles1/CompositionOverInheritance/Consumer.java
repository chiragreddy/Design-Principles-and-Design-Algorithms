package Principles1.CompositionOverInheritance;

import org.springframework.stereotype.Component;

@Component
public class Consumer {

	public String getCode() {
		return "10";
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

@Component
class AirIndia extends Consumer{
	
	// all methods are inherited
		public String getName() {
			return "AIR";
		}
	
}
@Component
class AirChina extends Consumer{
	
	// all methods are inherited
	public String getName() {
		return "AIC";
	}
	
}
@Component
class Qatar extends Consumer{
	
	// all methods are inherited
	public String getName() {
		return "QTR";
	}
	
}