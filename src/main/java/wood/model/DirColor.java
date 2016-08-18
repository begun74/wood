package wood.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "dirColor")
public class DirColor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5165039364035553050L;

	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_dirColor")
	private long id;
	
	@NotEmpty (message = "Please enter color name.") 
	private String name;

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
	
	

}
