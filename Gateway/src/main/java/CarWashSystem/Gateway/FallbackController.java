package CarWashSystem.Gateway;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@Configuration
@RestController
@CrossOrigin
public class FallbackController {
	
	@RequestMapping("/customerManagementError")
	public Mono<String> CustomerManagementServiceError(){
		return Mono.just("Error in Customer-Management-Service");
	}
	@RequestMapping("/carWasherManagementError")
	public Mono<String> CarWasherManagementServiceError(){
		return Mono.just("Error in CarWasher-Management-Service");
	}
	@RequestMapping("/adminManagementError")
	public Mono<String> AdminManagementServiceError(){
		return Mono.just("Error in Admin-Management-Service");
	}
	@RequestMapping("/notificationError")
	public Mono<String> NotificationServiceError(){
		return Mono.just("Error in Notification-Service");
	}
	@RequestMapping("/paymentError")
	public Mono<String> paymentServiceError(){
		return Mono.just("Error in Payment-Service");
	}

}
