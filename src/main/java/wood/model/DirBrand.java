package wood.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "dirBrand")
public class DirBrand implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2604339347289470146L;

	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_dirBrand")
	private long id;
	
	@NotEmpty (message = "Please enter brand name.") 
	private String name;

	private String description;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
	
	
	

}
