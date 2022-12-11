package Principles1.CompositionOverInheritance;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// JAVA BASED CONFIGUURATION
@Configuration
public class CompanyConfig {

	  @Bean
	  public CompanyImplCompositionConsumers company() {
	    return new CompanyImplCompositionConsumers();
	  }
	
}
