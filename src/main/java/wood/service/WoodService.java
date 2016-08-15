package wood.service;

import java.util.List;

import wood.model.DirColor;
import wood.model.DirCustomer;
import wood.model.Particleboard;

public interface WoodService {
	
	public List<DirCustomer> getListDirCustomers();
	
	public List<DirColor> getListDirColors();
	public void addColor(DirColor dirColor);
	public DirColor getDirColor(long id);
	public void addParticleboard(Particleboard particleboard);

	public List<Particleboard> getListParticleboards();

}
