package wood.service;

import java.util.List;

import wood.model.DirBrand;
import wood.model.DirColor;
import wood.model.DirCustomer;
import wood.model.Particleboard;

public interface WoodService {
	
	public List<DirCustomer> getListDirCustomers();
	

	public void addBrand(DirBrand dirBrand);
	public DirBrand getDirBrand(long id);
	public List<DirBrand> getListDirBrands();

	public void addColor(DirColor dirColor);
	public DirColor getDirColor(long id);
	public List<DirColor> getListDirColors();
	
	public void addParticleboard(Particleboard particleboard);
	public Particleboard getParticleboard(long id);
	public List<Particleboard> getListParticleboards();

	public void delObject(Object obj);

}
