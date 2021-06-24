package carWashSystem.AdminManagementService.services;

import java.util.List;

import carWashSystem.AdminManagementService.models.Admin;

public interface AdminService {
	public void addAdmin(Admin admin);
	
	public List<Admin> getAdmins();
	
	public Admin getAdminsbyId(String id);
	
	public void update(Admin admin);
	
	public void delete(String id);

}
