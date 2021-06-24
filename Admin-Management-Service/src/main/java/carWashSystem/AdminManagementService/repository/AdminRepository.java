package carWashSystem.AdminManagementService.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import carWashSystem.AdminManagementService.models.Admin;

@Repository
public interface AdminRepository extends MongoRepository<Admin, String> {
}
