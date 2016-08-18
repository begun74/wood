package wood.dao;

import java.util.List;

import wood.model.DirColor;
import wood.model.DirCustomer;
import wood.model.Particleboard;

public interface DAO {

	
	public List<DirCustomer> getAllDirCustomers();

	public void addColor(DirColor dirColor);
	public DirColor getDirColor(long id);
	public List<DirColor> getAllDirColors();
	
	public void addParticleboard(Particleboard particleboard);
	public Particleboard getParticleboard(long id);
	public List<Particleboard> getAllParticleboards(); 
	
	public void delObject(Object obj);
}
