package carWashSystem.CarWasherManagementService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import carWashSystem.CarWasherManagementService.models.CarWasher;

@Repository
public interface CarWasherServiceRepository extends MongoRepository<CarWasher,String>{

}
