package wood.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DirColor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5165039364035553050L;

	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id_dirColor;
	
	private String name;

	public long getId_dirColor() {
		return id_dirColor;
	}

	public void setId_dirColor(long id_dirColor) {
		this.id_dirColor = id_dirColor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
