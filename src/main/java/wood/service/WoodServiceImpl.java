package wood.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wood.annotation.Loggable;
import wood.dao.DAOImpl;
import wood.model.DirBrand;
import wood.model.DirColor;
import wood.model.DirCustomer;
import wood.model.Particleboard;
import wood.model.Request;


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

	//@Loggable
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
		//try {
			dao.delObject(obj);
		
			//if(obj instanceof Particleboard)
			//	throw new Exception();
		
		//} catch (Exception e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		//}
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

	@Override
	public List<Particleboard> getListParticleboards(Particleboard example_particleboard) {
		// TODO Auto-generated method stub
		return dao.getAllParticleboards(example_particleboard);
	}

	@Loggable
	@Override
	public List<Particleboard> getAllParticleboards(
			Particleboard example_particleboard, int priceFrom, int priceTo) {
		// TODO Auto-generated method stub
		return dao.getAllParticleboards(example_particleboard, priceFrom, priceTo);
	}

	@Override
	public void addRequest(Request request) {
		// TODO Auto-generated method stub
		dao.addRequest(request);
	}

	@Override
	public Request getRequest(long id) {
		// TODO Auto-generated method stub
		return dao.getRequest(id);
	}

	@Override
	public List<Request> getAllRequest() {
		// TODO Auto-generated method stub
		return dao.getAllRequest();
	}


}
