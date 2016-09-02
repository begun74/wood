package wood.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name = "request")
public class Request  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5176083582649973633L;
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id_request;

	private Timestamp creation_date;

	@NotEmpty (message = "Please enter request name.")
	private String name;
	
	private String description;
	
	private long fk_particleboard;
	
	private long fk_dirCustomer;
	
	private String phone;
	
	

	public long getId_request() {
		return id_request;
	}

	public void setId_request(long id_request) {
		this.id_request = id_request;
	}

	public Timestamp getCreation_date() {
		return creation_date;
	}

	public void setCreation_date(Timestamp creation_date) {
		this.creation_date = creation_date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getFk_particleboard() {
		return fk_particleboard;
	}

	public void setFk_particleboard(long fk_particleboard) {
		this.fk_particleboard = fk_particleboard;
	}

	public long getFk_dirCustomer() {
		return fk_dirCustomer;
	}

	public void setFk_dirCustomer(long fk_dirCustomer) {
		this.fk_dirCustomer = fk_dirCustomer;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
}
