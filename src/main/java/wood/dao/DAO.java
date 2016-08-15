package wood.dao;

import java.util.List;

import wood.model.DirColor;
import wood.model.DirCustomer;

public interface DAO {

	
	public List<DirCustomer> getAllDirCustomers();
	public List<DirColor> getAllDirColors();
	public void addColor(DirColor dirColor);
}
