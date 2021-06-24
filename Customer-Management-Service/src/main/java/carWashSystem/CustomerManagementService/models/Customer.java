package carWashSystem.CustomerManagementService.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="customer")
public class Customer {
	@Id
	private String customer_id;
	private String customer_usernmename;
	private String customer_password;
	private String customer_address;
	private String bank_details;
	public Customer() {
		
	}
	public Customer( String customer_usernmename, String customer_password, String customer_address,
			String bank_details) {
		this.customer_usernmename = customer_usernmename;
		this.customer_password = customer_password;
		this.customer_address = customer_address;
		this.bank_details = bank_details;
	}
	
	public Customer(String customer_id, String customer_usernmename, String customer_password, String customer_address,
			String bank_details) {
		this.customer_id = customer_id;
		this.customer_usernmename = customer_usernmename;
		this.customer_password = customer_password;
		this.customer_address = customer_address;
		this.bank_details = bank_details;
	}
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_usernmename() {
		return customer_usernmename;
	}
	public void setCustomer_usernmename(String customer_usernmename) {
		this.customer_usernmename = customer_usernmename;
	}
	public String getCustomer_password() {
		return customer_password;
	}
	public void setCustomer_password(String customer_password) {
		this.customer_password = customer_password;
	}
	public String getCustomer_address() {
		return customer_address;
	}
	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}
	public String getBank_details() {
		return bank_details;
	}
	public void setBank_details(String bank_details) {
		this.bank_details = bank_details;
	
	}
	
	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", customer_usernmename=" + customer_usernmename
				+ ", customer_password=" + customer_password + ", customer_address=" + customer_address
				+ ", bank_details=" + bank_details + "]";
	}
}
