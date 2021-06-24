package carWashSystem.CarWashSystem.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import carWashSystem.CarWashSystem.model.User;

public interface UserRepository extends MongoRepository<User, String>{
        User findByUsername(String username);

}
