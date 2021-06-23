package org.codejudge.sb.service;

import java.util.List;

import org.codejudge.sb.model.DriverModel;


public interface DriverService {
	
	public List<DriverModel> retrieveDriverModels();

	public DriverModel getDriverModel(Long driverID);
	 
	public void saveDriverModel(DriverModel driverModel);
	 
	public void deleteDriverModel(Long driverID);
	 
	public void updateDriverModel(DriverModel driverModel);
	
}
