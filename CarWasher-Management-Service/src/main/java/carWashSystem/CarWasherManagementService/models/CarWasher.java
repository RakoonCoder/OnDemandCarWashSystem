package carWashSystem.CarWasherManagementService.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="carwasher")
public class CarWasher {
	@Id
	private String carwasher_id;
	private String carwasher_usernmename;
	private String carwasher_password;
	private String bank_details;
	public CarWasher() {
	}
	public CarWasher(String carwasher_id, String carwasher_usernmename, String carwasher_password,
			String bank_details) {
		super();
		this.carwasher_id = carwasher_id;
		this.carwasher_usernmename = carwasher_usernmename;
		this.carwasher_password = carwasher_password;
		this.bank_details = bank_details;
	}
	public CarWasher(String carwasher_usernmename, String carwasher_password, String bank_details) {
		super();
		this.carwasher_usernmename = carwasher_usernmename;
		this.carwasher_password = carwasher_password;
		this.bank_details = bank_details;
	}
	public String getCarwasher_id() {
		return carwasher_id;
	}
	public void setCarwasher_id(String carwasher_id) {
		this.carwasher_id = carwasher_id;
	}
	public String getCarwasher_usernmename() {
		return carwasher_usernmename;
	}
	public void setCarwasher_usernmename(String carwasher_usernmename) {
		this.carwasher_usernmename = carwasher_usernmename;
	}
	public String getCarwasher_password() {
		return carwasher_password;
	}
	public void setCarwasher_password(String carwasher_password) {
		this.carwasher_password = carwasher_password;
	}
	public String getBank_details() {
		return bank_details;
	}
	public void setBank_details(String bank_details) {
		this.bank_details = bank_details;
	}
	@Override
	public String toString() {
		return "CarWasher [carwasher_id=" + carwasher_id + ", carwasher_usernmename=" + carwasher_usernmename
				+ ", carwasher_password=" + carwasher_password + ", bank_details=" + bank_details + "]";
	}
	

}
