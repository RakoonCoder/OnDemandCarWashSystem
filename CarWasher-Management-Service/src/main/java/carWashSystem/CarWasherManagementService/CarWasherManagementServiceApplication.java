package carWashSystem.CarWasherManagementService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import carWashSystem.CarWasherManagementService.service.CarwasherServiceImpl;

@SpringBootApplication
@EnableEurekaClient
public class CarWasherManagementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarWasherManagementServiceApplication.class, args);
	}
	@Bean
	@LoadBalanced
	public RestTemplate getrestTemplate(){
		return new RestTemplate();
	
	}

	@Bean
	public CarwasherServiceImpl getcustomerService(){
		return new CarwasherServiceImpl();
	}
}
