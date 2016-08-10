package wood.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
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

}
