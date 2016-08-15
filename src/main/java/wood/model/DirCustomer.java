package wood.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "dirCustomer")
public class DirCustomer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7549812476147468646L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id_dirCustomer;
	
	private String name;
	
	private Timestamp creation_date;

	public long getId_dirCustomer() {
		return id_dirCustomer;
	}

	public void setId_dirCustomer(long id_dirCustomer) {
		this.id_dirCustomer = id_dirCustomer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Timestamp getCreation_date() {
		return creation_date;
	}

	public void setCreation_date(Timestamp creation_date) {
		this.creation_date = creation_date;
	}
	
	

}
