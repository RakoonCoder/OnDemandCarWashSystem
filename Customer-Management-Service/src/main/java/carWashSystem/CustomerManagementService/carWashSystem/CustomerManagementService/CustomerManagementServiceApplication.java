package carWashSystem.CustomerManagementService.carWashSystem.CustomerManagementService;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


import carWashSystem.CustomerManagementService.services.CustomerServiceImpl;

@SpringBootApplication
@EnableEurekaClient
public class CustomerManagementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerManagementServiceApplication.class, args);
	}
	@Bean
	@LoadBalanced
	public RestTemplate getrestTemplate(){
		return new RestTemplate();
	
	}

	@Bean
	public CustomerServiceImpl getcustomerService(){
		return new CustomerServiceImpl();
	}

}
