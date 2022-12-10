package Principles1.CompositionOverInheritance;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Executor {

	 //static CompanyImplCompositionConsumers company = new CompanyImplCompositionConsumers();
	 static ApplicationContext context =
			    new ClassPathXmlApplicationContext();
	 @Autowired
	 static CompanyImplCompositionConsumers company = context.getBean(CompanyImplCompositionConsumers.class);
	
	public static void main(String[] args) {

		AirIndia airI = new AirIndia();
		AirChina airC = new AirChina();
		List<Consumer> li = new ArrayList<>();
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
