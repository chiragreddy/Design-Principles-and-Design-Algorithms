package Principles1.CompositionOverInheritance;

import java.util.ArrayList;
import java.util.List;

public class Executor {

	/*
	 * Assuming initially we have AirIndiaConsumer, AirChinaConsumer extending from
	 * Company class, so if we have to add a new consumer we need to create another
	 * class extending from the company (Supplier). This is tightly coupled. So, in
	 * order to make it loosely coupled, we create a Consumer class and all
	 * consumers and the new consumers we want to add now extend from Consumer
	 * class. And the consumer class will now be composed in COMPANY class as a set
	 * of consumers using Composition. This allows us to add any number of consumers
	 * to a company at runtime.( where in inheritance, the company and consumer
	 * relationships like AirIndiaConsumer has to be decided at compile time. So,
	 * Composition allows behavior changes at runtime.
	 */
	
	static CompanyImplCompositionConsumers company = new CompanyImplCompositionConsumers();
	public static void main(String[] args) {
		
		Consumer airI = new AirIndia(); // Polymorphism - different classes sharing same type/interface
		Consumer airC = new AirChina();
		List<Consumer> li = new ArrayList();
		li.add(airI);
		li.add(airC);
		company.setConsumers(li);
	
		for(Consumer c: company.getConsumers()) {
			System.out.println(c.getName());
		}
		
	}

	public static CompanyImplCompositionConsumers getCompany() {
		return company;
	}

	public static void setCompany(CompanyImplCompositionConsumers company) {
		Executor.company = company;
	}
	
}
