package carWashSystem.CustomerManagementService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import carWashSystem.CustomerManagementService.models.Customer;

@Repository
public interface CustomerServiceRepository extends MongoRepository<Customer, String> {

}
