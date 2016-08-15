package wood.dao;

import java.util.List;

import wood.model.DirColor;
import wood.model.DirCustomer;
import wood.model.Particleboard;

public interface DAO {

	
	public List<DirCustomer> getAllDirCustomers();
	public List<DirColor> getAllDirColors();
	public DirColor getDirColor(long id);
	public List<Particleboard> getAllParticleboards(); 
	public void addColor(DirColor dirColor);
	public void addParticleboard(Particleboard particleboard);
}
