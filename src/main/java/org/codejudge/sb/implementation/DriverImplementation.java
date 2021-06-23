package org.codejudge.sb.implementation;

import java.util.List;
import java.util.Optional;
import org.codejudge.sb.model.DriverModel;
import org.codejudge.sb.repository.DriverRepository;
import org.codejudge.sb.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DriverImplementation implements DriverService{
	 
	 @Autowired
	 private DriverRepository driverRepository;
	 
	 public void setDriverRepository(DriverRepository driverRepository) {
	  this.driverRepository = driverRepository;
	 }
	  
	 public List<DriverModel> retrieveDriverModels() {
	  List<DriverModel> drivers = driverRepository.findAll();
	  return drivers;
	 }
	  
	 public DriverModel getDriverModel(Long driverID) {
	  Optional<DriverModel> optEmp = driverRepository.findById(driverID);
	  return optEmp.get();
	 }
	  
	 public void saveDriverModel(DriverModel driverModel){
		 driverRepository.save(driverModel);
	 }
	  
	 public void deleteDriverModel(Long driverID){
		 driverRepository.deleteById(driverID);
	 }
	  
	 public void updateDriverModel(DriverModel driverModel) {
		 driverRepository.save(driverModel);
	 }
	
}
