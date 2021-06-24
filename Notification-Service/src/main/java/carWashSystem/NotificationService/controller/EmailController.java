package carWashSystem.NotificationService.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import carWashSystem.NotificationService.model.Email;
import carWashSystem.NotificationService.service.EmailService;

@RestController
@RequestMapping("/notification")
public class EmailController {
	private EmailService emailService;
	
	@PostMapping(value="/textemail" , consumes="application/json")
	public String sendEmail(@RequestBody Email email){
		try{
			emailService.sendTextEmail(email);
			return "Email sent";
			
		}catch(Exception ex){
			return "Error sending email";
		}
		
	}

}
