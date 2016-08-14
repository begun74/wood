package wood.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Particleboard implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -305820481244587257L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id_particleboard;
	
	private long thickness;
	private long length;
	private long weight;
	private long price;
	private long fk_dirColor;
	
	
	
	public long getId_particleboard() {
		return id_particleboard;
	}
	public void setId_particleboard(long id_particleboard) {
		this.id_particleboard = id_particleboard;
	}
	public long getThickness() {
		return thickness;
	}
	public void setThickness(long thickness) {
		this.thickness = thickness;
	}
	public long getLength() {
		return length;
	}
	public void setLength(long length) {
		this.length = length;
	}
	public long getWeight() {
		return weight;
	}
	public void setWeight(long weight) {
		this.weight = weight;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public long getFk_dirColor() {
		return fk_dirColor;
	}
	public void setFk_dirColor(long fk_dirColor) {
		this.fk_dirColor = fk_dirColor;
	}

	
	

}
