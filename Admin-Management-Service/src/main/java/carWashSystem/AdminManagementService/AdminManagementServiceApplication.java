package carWashSystem.AdminManagementService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class AdminManagementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminManagementServiceApplication.class, args);
	}
	@Bean
	@LoadBalanced
	public RestTemplate getrestTemplate(){
		return new RestTemplate();
	}
}
