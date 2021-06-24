package carWashSystem.CustomerManagementService.services;

import java.util.List;

import org.springframework.stereotype.Service;

import carWashSystem.CustomerManagementService.models.Customer;

@Service
public interface CustomerService {
	public void addCustomer(Customer customer);
	
	public List<Customer> getCustomer();
	
	public Customer getCustomerbyId(String id);
	
	public void update(Customer customer);
	
	public void delete(String id);
}
