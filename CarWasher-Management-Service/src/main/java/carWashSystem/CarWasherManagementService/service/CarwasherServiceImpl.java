package carWashSystem.CarWasherManagementService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import carWashSystem.CarWasherManagementService.models.CarWasher;
import carWashSystem.CarWasherManagementService.repository.CarWasherServiceRepository;

public class CarwasherServiceImpl implements CarWasherService{
	@Autowired
	CarWasherServiceRepository carWasherRepository;
	
	public CarwasherServiceImpl(CarWasherServiceRepository carWasherRepository) {
		this.carWasherRepository = carWasherRepository;
	}
	
	public CarwasherServiceImpl() {
	}
	public void addCarWasher(CarWasher carWasher){
		carWasherRepository.insert(carWasher);
	}
	
	public List<CarWasher> getCarWasher(){
		
		return carWasherRepository.findAll();
	}

	public CarWasher getCarWasherbyId(String id){
	 return	carWasherRepository.findById(id).orElseThrow(()->new RuntimeException(String.format("Cannot find carwasher by %s", id)));
		
			
	}
	
	public void update(CarWasher carWasher){
		CarWasher savedCarWasher= carWasherRepository.findById(carWasher.getCarwasher_id())
				.orElseThrow(()->new RuntimeException(String.format("Cannot find carwasherr by id %s",carWasher.getCarwasher_id())));
		
		savedCarWasher.setCarwasher_id(carWasher.getCarwasher_id());
		savedCarWasher.setCarwasher_usernmename(carWasher.getCarwasher_usernmename());
		savedCarWasher.setCarwasher_password(carWasher.getCarwasher_password());
		savedCarWasher.setBank_details(carWasher.getBank_details());
		
		carWasherRepository.save(carWasher);
						
		
	}
	
	
	public void delete(String id) {
		carWasherRepository.deleteById(id);
		
	}

	
	

}
