package carWashSystem.NotificationService.model;

import javax.validation.constraints.Max;

public class Email {
	
	@javax.validation.constraints.Email
   	private String sendTo;
	
	@Max(value=100)
	private String subject;
	@Max(value=500)
	private String body;
	public Email(String sendTo, String subject, String body) {
		super();
		this.sendTo = sendTo;
		this.subject = subject;
		this.body = body;
	}
	public Email() {
	
	}
	public String getSendTo() {
		return sendTo;
	}
	public void setSendTo(String sendTo) {
		this.sendTo = sendTo;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	@Override
	public String toString() {
		return "Email [sendTo=" + sendTo + ", subject=" + subject + ", body=" + body + "]";
	}
	
	

}
