package wood.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;





import wood.dao.DAOImpl;
import wood.model.DirBrand;
import wood.model.DirColor;
import wood.model.DirCustomer;
import wood.model.Particleboard;


@Service("woodService")
@Transactional()
public class WoodServiceImpl implements WoodService {

	@Autowired
	private DAOImpl dao;
	
	public List<DirCustomer> getListDirCustomers() {
		return dao.getAllDirCustomers();
	}

	public List<DirColor> getListDirColors() {
		return dao.getAllDirColors();
	}

	@Override
	public void addColor(DirColor dirColor) {
		dao.addColor(dirColor);
	}

	@Override
	public void addParticleboard(Particleboard particleboard) {
		// TODO Auto-generated method stub
		dao.addParticleboard(particleboard);
	}

	@Override
	public List<Particleboard> getListParticleboards() {
		// TODO Auto-generated method stub
		return dao.getAllParticleboards();
	}

	@Override
	public DirColor getDirColor(long id) {
		// TODO Auto-generated method stub
		return dao.getDirColor(id);
	}

	@Override
	public void delObject(Object obj) {
		// TODO Auto-generated method stub
		dao.delObject(obj);
	}

	@Override
	public Particleboard getParticleboard(long id) {
		// TODO Auto-generated method stub
		return dao.getParticleboard(id);
	}

	@Override
	public void addBrand(DirBrand dirBrand) {
		dao.addBrand(dirBrand);
	}

	@Override
	public DirBrand getDirBrand(long id) {
		return dao.getDirBrand(id);
	}

	@Override
	public List<DirBrand> getListDirBrands() {
		return dao.getAllDirBrands();
	}


}
