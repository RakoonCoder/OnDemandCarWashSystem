package carWashSystem.AdminManagementService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import carWashSystem.AdminManagementService.models.Admin;
import carWashSystem.AdminManagementService.services.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	 
	 @Autowired
	   private AdminService adminService;
		
		@PostMapping("/addadmin")
		public  ResponseEntity<Object> saveAdmin(@RequestBody Admin admin) {
			adminService.addAdmin(admin);
			return ResponseEntity.status(HttpStatus.CREATED).build();
		}
		
		@GetMapping("/getadmin")
		public ResponseEntity<List<Admin>> getAdmins(){
			
			return ResponseEntity.ok(adminService.getAdmins());
			
		}
		
		@GetMapping("/{id}")
		public  ResponseEntity<Admin> getAdminsbyId(@PathVariable String id){
			return ResponseEntity.ok(adminService.getAdminsbyId(id));	
		}
		
		@PutMapping("/updateadmint/{id}")
		public  ResponseEntity<Object> updateAdmin(@RequestBody Admin admin) {
			adminService.update(admin);
			return ResponseEntity.ok().build();
		}
		
		@DeleteMapping("/{id}")
		public  ResponseEntity<Object> delete(@PathVariable String id,@RequestBody Admin admin) {
			adminService.delete(id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}

	   /* @RequestMapping("/{username}")
	    public admin getAdminInfo(@PathVariable("username") String username){
	    	admin ad= new admin();
	    	ad.setAdmin_email("abc@123");
	        return new admin(ad.getAdmin_email(), username);
	    }*/
}
