package carWashSystem.AdminManagementService.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "admin")
public class Admin {
	
	@Id
	private String id;
	private String admin_email;
	private String admin_password;
	
	public Admin(){	
	}

	public Admin(String id, String admin_email, String admin_password) {
		this.id = id;
		this.admin_email = admin_email;
		this.admin_password = admin_password;
	}


	public Admin(String admin_email, String admin_password) {
		this.admin_email = admin_email;
		this.admin_password = admin_password;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAdmin_email() {
		return admin_email;
	}
	public void setAdmin_email(String admin_email) {
		this.admin_email = admin_email;
	}
	public String getAdmin_password() {
		return admin_password;
	}
	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}
	@Override
	public String toString() {
		return "admin [id=" + id + ", admin_email=" + admin_email + ", admin_password=" + admin_password + "]";
	}

}
