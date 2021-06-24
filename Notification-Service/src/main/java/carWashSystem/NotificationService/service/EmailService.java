package carWashSystem.NotificationService.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import carWashSystem.NotificationService.model.Email;

@Service
public class EmailService {

	private JavaMailSender javaMailSender;
	
	@Value("${email.address}")
	private String EmailAddress;
	
	public void sendTextEmail(Email email){
		SimpleMailMessage msg= new SimpleMailMessage();
		try{
			if(email.getSendTo().contains(",")){
				String[] emails= email.getSendTo().split(",");
				int recipientSize= emails.length;
				for(int i=0; i<recipientSize;i++){
					
					msg.setTo(emails[i]);
					msg.setSubject(email.getSubject());
					msg.setText(email.getBody());
				    javaMailSender.send(msg);
				}
				
			}else{
				msg.setTo(email.getSendTo());
				msg.setSubject(email.getSubject());
				msg.setText(email.getBody());
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
