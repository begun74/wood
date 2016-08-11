package wood.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import wood.dao.DAOImpl;
import wood.model.DirCustomer;


@Service("woodService")
@Transactional()
public class WoodServiceImpl implements WoodService {

	@Autowired
	private DAOImpl dao;
	
	public List<DirCustomer> getListDirCustomers() {
		return dao.getAllDirCustomers();
	}

}
