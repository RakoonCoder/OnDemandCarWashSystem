package carWashSystem.AdminManagementService.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import carWashSystem.AdminManagementService.models.Admin;
import carWashSystem.AdminManagementService.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AdminRepository adminRepository;
	
	public AdminServiceImpl(AdminRepository adminRepository) {
		this.adminRepository = adminRepository;
	}
	public void addAdmin(Admin admin){
		adminRepository.insert(admin);
		
	}
	public List<Admin> getAdmins(){
		
		return adminRepository.findAll();
	}

	public Admin getAdminsbyId(String id){
	 return	adminRepository.findById(id).orElseThrow(()->new RuntimeException(String.format("Cannot find admin by %s", id)));
		
			
	}
	
	public void update(Admin admin) {
		Admin savedAdmin= adminRepository.findById(admin.getId())
				.orElseThrow(()->new RuntimeException(String.format("Cannot find admin by id %s", admin.getId())));
		
		savedAdmin.setId(admin.getId());
		savedAdmin.setAdmin_email(admin.getAdmin_email());
		savedAdmin.setAdmin_password(admin.getAdmin_password());
		
		adminRepository.save(admin);
						
		
	}
	
	
	public void delete(String id) {
		adminRepository.deleteById(id);
		
	}
}
