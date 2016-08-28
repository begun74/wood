package wood.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import wood.model.DirBrand;
import wood.model.DirColor;
import wood.model.DirCustomer;
import wood.model.Particleboard;




@Repository("dao")
public  class DAOImpl implements DAO {

	@Autowired
    private SessionFactory sessionFactory;
	
	
	protected Session getSession(){
        return sessionFactory.getCurrentSession();
    }

	@SuppressWarnings("unchecked")
	public List<DirCustomer> getAllDirCustomers() {
		return (ArrayList<DirCustomer>)getSession().createSQLQuery("select * from dirCustomer order by name").addEntity(DirCustomer.class).list();
	}

	@SuppressWarnings("unchecked")
	public List<DirColor> getAllDirColors() {
		return (ArrayList<DirColor>)getSession().createSQLQuery("select * from dirColor order by name").addEntity(DirColor.class).list();
	}

	@SuppressWarnings("unchecked")
	public List<Particleboard> getAllParticleboards() {
		return (ArrayList<Particleboard>)getSession().createSQLQuery("select * from particleboard").addEntity(Particleboard.class).list();
	}

	
	@Override
	public void addColor(DirColor dirColor) {
		getSession().saveOrUpdate(dirColor);
	}

	@Override
	public void addParticleboard(Particleboard particleboard) {
		getSession().saveOrUpdate(particleboard);
	}

	@Override
	public DirColor getDirColor(long id) {
		// TODO Auto-generated method stub
		return (DirColor) getSession().get(DirColor.class, id);
	}

	@Override
	public void delObject(Object obj) {
		getSession().delete(obj);		
	}

	@Override
	public Particleboard getParticleboard(long id) {
		// TODO Auto-generated method stub
		return (Particleboard)getSession().get(Particleboard.class, id);
	}

	@Override
	public void addBrand(DirBrand dirBrand) {
		getSession().saveOrUpdate(dirBrand);
	}

	@Override
	public DirBrand getDirBrand(long id) {
		return (DirBrand)getSession().get(DirBrand.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<DirBrand> getAllDirBrands() {
		return (List<DirBrand>)getSession().createSQLQuery("select * from dirBrand order by name").addEntity(DirBrand.class).list();
	}

	
	
}
