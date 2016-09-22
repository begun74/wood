package wood.dao;

import java.util.List;

import org.hibernate.criterion.Example;

import wood.model.DirBrand;
import wood.model.DirColor;
import wood.model.DirCustomer;
import wood.model.PartType;
import wood.model.Particleboard;
import wood.model.Request;

public interface DAO {

	
	public List<DirCustomer> getAllDirCustomers();

	public void addBrand(DirBrand dirBrand);
	public DirBrand getDirBrand(long id);
	public List<DirBrand> getAllDirBrands();

	public void addColor(DirColor dirColor);
	public DirColor getDirColor(long id);
	public List<DirColor> getAllDirColors();
	
	public void addPartType(PartType partType);
	public PartType getPartType(long id);
	public List<PartType> getListPartTypes();
	
	public void addParticleboard(Particleboard particleboard);
	public Particleboard getParticleboard(long id);
	public List<Particleboard> getAllParticleboards(); 
	public List<Particleboard> getAllParticleboards(Particleboard example_particleboard); 
	public List<Particleboard> getAllParticleboards(Particleboard example_particleboard,double priceFrom,double priceTo);
	
	public void addRequest(Request request);
	public Request getRequest(long id);
	public List<Request> getAllRequest();
	
	public void delObject(Object obj);
}
