package Principles1.CompositionOverInheritance;

public class CompanyImpl implements Company{

	// When we have different consumers where they all extend from company, this is tightly coupled. Also, adding or removing consumer companies will be difficult
	
	public String getCode() {
		return null;
	}

	public void setCode(String code) {
		// TODO Auto-generated method stub
		
	}

	public String getName() {
		return null;
	}

	public void setName(String name) {
		
	}

	public boolean isHosted() {
		return false;
	}

}
