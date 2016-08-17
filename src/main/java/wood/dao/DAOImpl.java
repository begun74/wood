package wood.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
		getSession().save(dirColor);
	}

	@Override
	public void addParticleboard(Particleboard particleboard) {
		getSession().save(particleboard);
	}

	@Override
	public DirColor getDirColor(long id) {
		// TODO Auto-generated method stub
		return (DirColor) getSession().get(DirColor.class, id);
	}

	/*
	@Override
	public void delParticleboard(long id) {
		// TODO Auto-generated method stub
		getSession().createSQLQuery("delete from particleboard where id_particleboard = :id").setParameter("id", id).executeUpdate();
	}
*/

	
	@Override
	public void delObject(Object obj) {
		getSession().delete(obj);		
	}

	@Override
	public Particleboard getParticleboard(long id) {
		// TODO Auto-generated method stub
		return (Particleboard)getSession().get(Particleboard.class, id);
	}

	
	
}
