package carWashSystem.CarWasherManagementService.configuration;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class CarWasherSwagger {
	@Bean
	public Docket config(){
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build()
				.apiInfo(appInformation());
		
	}
	private ApiInfo appInformation() {
		return new ApiInfo("Swagger for CarWasherSystem",
				"Private Api", 
				"2.3.11",
				"Using SpringBoot",
				new springfox.documentation.service.Contact("Anuragini","anuraginipathak0@gmail.com", "1234567890"),
				"CarWasher Info",
				"Swagger", Collections.emptyList());
		
	
				
	
	}
}
