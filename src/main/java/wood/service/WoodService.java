package wood.service;

import java.util.Collection;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Criterion;

import wood.model.DirBrand;
import wood.model.DirColor;
import wood.model.DirCustomer;
import wood.model.PartType;
import wood.model.Particleboard;
import wood.model.Request;

public interface WoodService {
	
	public List<DirCustomer> getListDirCustomers();
	

	public void addBrand(DirBrand dirBrand);
	public DirBrand getDirBrand(long id);
	public List<DirBrand> getListDirBrands();

	public void addColor(DirColor dirColor);
	public DirColor getDirColor(long id);
	public List<DirColor> getListDirColors();

	public void addPartType(PartType partType);
	public PartType getPartType(long id);
	public List<PartType> getListPartTypes();
	
	
	public void addParticleboard(Particleboard particleboard);
	public Particleboard getParticleboard(long id);
	public List<Particleboard> getListParticleboards();
	public List<Particleboard> getListParticleboards(Particleboard example_particleboard, Collection<Criterion> criterions); 
	public List<Particleboard> getAllParticleboards(Particleboard example_particleboard, double priceFrom, double priceTo);	
	
	public void addRequest(Request request);
	public Request getRequest(long id);
	public List<Request> getAllRequest();
	
	
	public List<Integer> getAllThickness();
	public List<Integer> getAllLength();
	public List<Integer> getAllWeight();

	public void delObject(Object obj);

}
