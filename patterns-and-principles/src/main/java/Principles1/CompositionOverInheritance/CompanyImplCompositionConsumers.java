package Principles1.CompositionOverInheritance;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class CompanyImplCompositionConsumers implements Company{
	
	// Loosely coupled compared to Inheritance
	// Also, now we can add or delete consumers to this Company class easily to the list
	@Autowired
	Consumer consumer;
	static List<Consumer> consumers;
	
	public static List<Consumer> getConsumers() {
		return consumers;
	}

	public void setConsumers(List<Consumer> consumers) {
		this.consumers = consumers;
	}

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