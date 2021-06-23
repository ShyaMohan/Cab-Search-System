package org.codejudge.sb.controller;

import io.swagger.annotations.ApiOperation;

import java.util.List;

import org.codejudge.sb.model.DriverModel;
import org.codejudge.sb.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AppController {


	@ApiOperation("This is the hello world api")
	@GetMapping("/")
	public String hello() { 
		return "Hello World !!";
	}


	@Autowired
	private DriverService driverService;

	public void setDriverService(DriverService driverService) {
		this.driverService = driverService;
	}

	@GetMapping("/api/drivers")
	public List<DriverModel> getDriverModels() {
		List<DriverModel> drivers = driverService.retrieveDriverModels();
		return drivers;
	}

	@GetMapping("/api/drivers/{driverID}")
	public DriverModel getDriverModel(@PathVariable(name="driverID")Long driverID) {
		return driverService.getDriverModel(driverID);
	}

	@PostMapping("/api/drivers")
	public void saveDriverModel(DriverModel driverModel){
		driverService.saveDriverModel(driverModel);
		System.out.println("DriverModel Saved Successfully");
	}

	@DeleteMapping("/api/drivers/{driverID}")
	public void deleteDriverModel(@PathVariable(name="driverID")Long driverID){
		driverService.deleteDriverModel(driverID);
		System.out.println("DriverModel Deleted Successfully");
	}

	@PutMapping("/api/drivers/{driverID}")
	public void updateDriverModel(@RequestBody DriverModel driverModel,
			@PathVariable(name="driverID")Long driverID){
		DriverModel emp = driverService.getDriverModel(driverID);
		if(emp != null){
			driverService.updateDriverModel(driverModel);
		}

	}

}
/*
 * @PostMapping(value = "/api/drivers", headers =
 * {"content-type=application/json" }, consumes = "application/json") public
 * void saveDriverModel(@RequestBody DriverModel driverModel,
 * 
 * @PathVariable(name="driverID")Long driverID){
 * driverService.saveDriverModel(driverModel);
 * System.out.println("DriverModel Saved Successfully"); }
 */