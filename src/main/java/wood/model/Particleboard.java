package wood.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "particleboard")
public class Particleboard implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -305820481244587257L;

	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "fk_dirColor", nullable = false)
	private DirColor dirColor;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_particleboard")
	private long id;
	
	private long thickness;
	private long length;
	private long weight;
	private long price;

	@Column(insertable=false ,updatable=false)
	private  long fk_dirColor;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	
	public DirColor getDirColor() {
		return dirColor;
	}
	public void setDirColor(DirColor dirColor) {
		this.dirColor = dirColor;
	}

	
	

}
