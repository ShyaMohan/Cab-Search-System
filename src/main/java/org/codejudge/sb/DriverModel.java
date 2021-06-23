package org.codejudge.sb.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/*import javax.validation.constraints.Pattern;*/
/*import javax.validation.constraints.Size;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;*/




@Entity
@Table(name="CabDriver")
public class DriverModel {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long driverID;

	@Column(name="DRIVER_NAME")
	private String driverName;

	@Column(name="DRIVER_EMAIL", unique = true)
	private String driverEmail;


	//@Size()
	//@Pattern(regexp="^$[0-9]{10}")
	@Column(name="PHONE_NUMBER", unique = true, length=10)
	private Integer driverPhNumber;
	
	@Column(name="LICENSE_NUMBER", unique = true)
	private String driverLicenseNumber;

	@Column(name="CAR_NUMBER", unique = true)
	private String driverCarNumber;
	
	
	public Long getDriverID() {
		return driverID;
	}

	public void setDriverID(Long driverID) {
		this.driverID = driverID;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getDriverEmail() {
		return driverEmail;
	}

	public void setDriverEmail(String driverEmail) {
		this.driverEmail = driverEmail;
	}
	
	public Integer getDriverPhNumber() {
		return driverPhNumber;
	}

	public void setDriverPhNumber(Integer driverPhNumber) {
		this.driverPhNumber = driverPhNumber;
	}

	public String getDriverLicenseNumber() {
		return driverLicenseNumber;
	}

	public void setDriverLicenseNumber(String driverLicenseNumber) {
		this.driverLicenseNumber = driverLicenseNumber;
	}
	
	public String getDriverCarNumber() {
		return driverCarNumber;
	}
	
	public void setDriverCarNumber(String driverCarNumber) {
		this.driverCarNumber = driverCarNumber;
	}
}