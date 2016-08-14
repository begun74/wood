package wood.service;

import java.util.List;

import wood.model.DirColor;
import wood.model.DirCustomer;

public interface WoodService {
	
	public List<DirCustomer> getListDirCustomers();
	
	public List<DirColor> getListDirColors();

}
