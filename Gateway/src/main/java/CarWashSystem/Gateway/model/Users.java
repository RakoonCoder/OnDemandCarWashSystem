package CarWashSystem.Gateway.model;


import org.springframework.data.annotation.Id;

public class Users {
	
	public String _id;
	
	@Id
	public String username;
	public String password;
	
	public Users(){	
	}

	public Users(String _id, String username, String password) {
		this._id = _id;
		this.username = username;
		this.password = password;
	}

	public Users(String _id) {
		super();
		this._id = _id;
	}

	public String get_id() {
		return this._id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}

	
	
	

}
