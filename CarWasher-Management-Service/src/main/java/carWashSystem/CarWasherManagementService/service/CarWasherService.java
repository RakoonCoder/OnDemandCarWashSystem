package carWashSystem.CarWasherManagementService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import carWashSystem.CarWasherManagementService.models.CarWasher;

@Service
public interface CarWasherService {
	
	public void addCarWasher(CarWasher carWasher);
	
	public List<CarWasher> getCarWasher();
	
	public CarWasher getCarWasherbyId(String id);
	
	public void update(CarWasher carWasher);
	
	public void delete(String id);

}
