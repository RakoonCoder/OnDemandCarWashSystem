package CarWashSystem.Gateway.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import CarWashSystem.Gateway.model.Users;

public interface UserRepository extends MongoRepository<Users, String> {
	Users findByUsername(String username);

}
