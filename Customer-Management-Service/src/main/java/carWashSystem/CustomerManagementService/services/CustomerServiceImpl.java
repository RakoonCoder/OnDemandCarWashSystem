package carWashSystem.CustomerManagementService.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import carWashSystem.CustomerManagementService.models.Customer;
import carWashSystem.CustomerManagementService.repository.CustomerServiceRepository;

public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerServiceRepository customerServiceRepository;
	
	public CustomerServiceImpl(CustomerServiceRepository customerServiceRepository) {
		this.customerServiceRepository = customerServiceRepository;
	}
	
	public CustomerServiceImpl() {
	}

	public void addCustomer(Customer customer){
		customerServiceRepository.insert(customer);
		
	}
	public List<Customer> getCustomer(){
		
		return customerServiceRepository.findAll();
	}

	public Customer getCustomerbyId(String id){
	 return	customerServiceRepository.findById(id).orElseThrow(()->new RuntimeException(String.format("Cannot find customer by %s", id)));
		
			
	}
	
	public void update(Customer customer){
		Customer savedCustomer= customerServiceRepository.findById(customer.getCustomer_id())
				.orElseThrow(()->new RuntimeException(String.format("Cannot find customer by id %s",customer.getCustomer_id())));
		
		savedCustomer.setCustomer_id(customer.getCustomer_id());
		savedCustomer.setCustomer_usernmename(customer.getCustomer_usernmename());
		savedCustomer.setCustomer_password(customer.getCustomer_password());
		savedCustomer.setCustomer_address(customer.getCustomer_address());
		savedCustomer.setBank_details(customer.getBank_details());
	
		
		customerServiceRepository.save(customer);
						
		
	}
	
	
	public void delete(String id) {
		customerServiceRepository.deleteById(id);
		
	}

}
