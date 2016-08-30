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
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name = "particleboard")
public class Particleboard implements Serializable , Comparable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -305820481244587257L;

	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_particleboard")
	private Long id;
	
	@Min (message = "Please correct enter thickness.", value = 1)
	@NotNull(message = "Please correct enter thickness.")
	private Long thickness;
	
	@Min (message = "Please correct enter length.", value = 1)
	@NotNull(message = "Please correct enter length.")
	private Long length;
	
	@Min (message = "Please correct enter weight.", value = 1)
	@NotNull(message = "Please correct enter weight.")
	private Long weight;
	
	@Min (message = "Please correct enter price.", value = 0)
	@NotNull(message = "Please correct enter price.")
	private Long price;

	@Column(insertable=false ,updatable=false)
	private  Long fk_dirColor;
	
	@Column(insertable=false ,updatable=false)
	private  Long fk_dirBrand;

	private String fileName;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "fk_dirColor")
	private DirColor dirColor;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "fk_dirBrand")
	private DirBrand dirBrand;
	
	
	public Particleboard(long id) {
		super();
		this.id = id;
	}
	public Particleboard() {
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Long getThickness() {
		return thickness;
	}
	public void setThickness(Long thickness) {
		this.thickness = thickness;
	}
	public Long getLength() {
		return length;
	}
	public void setLength(Long length) {
		this.length = length;
	}
	public Long getWeight() {
		return weight;
	}
	public void setWeight(Long weight) {
		this.weight = weight;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	
	public Long getFk_dirColor() {
		return fk_dirColor;
	}
	public void setFk_dirColor(Long fk_dirColor) {
		this.fk_dirColor = fk_dirColor;
	}
	
	public Long getFk_dirBrand() {
		return fk_dirBrand;
	}
	public void setFk_dirBrand(Long fk_dirBrand) {
		this.fk_dirBrand = fk_dirBrand;
	}
	public DirColor getDirColor() {
		return dirColor;
	}
	public void setDirColor(DirColor dirColor) {
		this.dirColor = dirColor;
	}
	
	
	public DirBrand getDirBrand() {
		return dirBrand;
	}
	public void setDirBrand(DirBrand dirBrand) {
		this.dirBrand = dirBrand;
	}
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	@Override
	public int compareTo(Object o) {
		return this.id.compareTo(((Particleboard)o).getId());
	}

}
