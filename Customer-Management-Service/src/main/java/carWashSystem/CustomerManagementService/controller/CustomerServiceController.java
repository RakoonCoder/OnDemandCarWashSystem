package carWashSystem.CustomerManagementService.controller;

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

import carWashSystem.CustomerManagementService.models.Customer;
import carWashSystem.CustomerManagementService.services.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerServiceController {
	 @Autowired
	   private CustomerService customerService;
	 
	 
	 @GetMapping("/test")
     public String test(){
			
			return "customer service working";
			
		}
		
		@PostMapping("/addcustomer")
		public  ResponseEntity<Object> saveCustomer(@RequestBody Customer customer) {
			customerService.addCustomer(customer);
			return ResponseEntity.status(HttpStatus.CREATED).build();
		}
		
		@GetMapping("/getcustomer")
        public ResponseEntity<List<Customer>> getCustomers(){
			
			return ResponseEntity.ok(customerService.getCustomer());
			
		}
		
		@GetMapping("/{id}")
		public  ResponseEntity<Customer> getCustomerbyId(@PathVariable String id){
			return ResponseEntity.ok(customerService.getCustomerbyId(id));	
		}
		
		@PutMapping("/updatecustomer/{id}")
		public  ResponseEntity<Object> updateCustomer(@RequestBody Customer customer) {
			customerService.update(customer);
			return ResponseEntity.ok().build();
		}
		
		@DeleteMapping("/{id}")
		public  ResponseEntity<Object> delete(@PathVariable String id,@RequestBody Customer customer) {
			customerService.delete(id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}

}
