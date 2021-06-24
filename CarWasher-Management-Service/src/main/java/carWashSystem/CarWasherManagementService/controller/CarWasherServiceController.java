package carWashSystem.CarWasherManagementService.controller;

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

import carWashSystem.CarWasherManagementService.models.CarWasher;
import carWashSystem.CarWasherManagementService.service.CarWasherService;

@RestController
@RequestMapping("/carwasher")
public class CarWasherServiceController {
	@Autowired
	   private CarWasherService carwasherservice;
	 
	 
	 @GetMapping("/test")
     public String test(){
			
			return "carwasher service working";
			
		}
		
		@PostMapping("/addcarwasher")
		public  ResponseEntity<Object> saveCarWasher(@RequestBody CarWasher carwasher) {
			carwasherservice.addCarWasher(carwasher);
			return ResponseEntity.status(HttpStatus.CREATED).build();
		}
		
		@GetMapping("/getcarwasher")
     public ResponseEntity<List<CarWasher>> getCarWasher(){
			
			return ResponseEntity.ok(carwasherservice.getCarWasher());
			
		}
		
		@GetMapping("/{id}")
		public  ResponseEntity<CarWasher> getCarwashersbyId(@PathVariable String id){
			return ResponseEntity.ok(carwasherservice.getCarWasherbyId(id));	
		}
		
		@PutMapping("/updatecarwasher/{id}")
		public  ResponseEntity<Object> updateCustomer(@RequestBody CarWasher carWasher) {
			carwasherservice.update(carWasher);
			return ResponseEntity.ok().build();
		}
		
		@DeleteMapping("/{id}")
		public  ResponseEntity<Object> delete(@PathVariable String id,@RequestBody CarWasher carWasher) {
			carwasherservice.delete(id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}

}
