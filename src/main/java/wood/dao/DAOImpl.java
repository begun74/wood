package wood.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import wood.model.DirBrand;
import wood.model.DirColor;
import wood.model.DirCustomer;
import wood.model.PartType;
import wood.model.Particleboard;
import wood.model.Request;




@Repository("dao")
public  class DAOImpl implements DAO {

	@Autowired
    private SessionFactory sessionFactory;
	
	
	protected Session getSession(){
        return sessionFactory.getCurrentSession();
    }

	@SuppressWarnings("unchecked")
	public List<DirCustomer> getAllDirCustomers() {
		return getSession().createSQLQuery("select * from dirCustomer order by name").addEntity(DirCustomer.class).list();
	}

	@SuppressWarnings("unchecked")
	public List<DirColor> getAllDirColors() {
		return getSession().createSQLQuery("select * from dirColor order by name").addEntity(DirColor.class).list();
	}

	@SuppressWarnings("unchecked")
	public List<Particleboard> getAllParticleboards() {
		return getSession().createSQLQuery("select * from particleboard").addEntity(Particleboard.class).list();
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

	@SuppressWarnings("unchecked")
	@Override
	public List<Particleboard> getAllParticleboards(Particleboard example_particleboard,  Collection<Criterion> criterions) {
		// TODO Auto-generated method stub
		//System.out.println("example_particleboard - "+example_particleboard);
		Criteria criteria = getSession().createCriteria(Particleboard.class).add(Example.create(example_particleboard));
		
		if(criterions != null)
			criterions.forEach(c -> criteria.add(c));
		
		return criteria.list();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Particleboard> getAllParticleboards(Particleboard example_particleboard, double priceFrom, double priceTo) {

		Criteria crit = getSession().createCriteria(Particleboard.class)
				.add(Example.create(example_particleboard));
		
		if(priceFrom >0) crit = crit.add(Restrictions.ge("price",priceFrom));
		
		if(priceTo >0) crit = crit.add(Restrictions.le("price",priceTo));
		
		return (List<Particleboard>)crit.addOrder(Order.asc("price") ).list();
		
	}

	@Override
	public void addRequest(Request request) {
		getSession().saveOrUpdate(request);
	}

	@Override
	public Request getRequest(long id) {
		return (Request)getSession().get(Request.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Request> getAllRequest() {
		return getSession().createSQLQuery("select * from request order by creation_date").addEntity(Request.class).list();
	}

	@Override
	public void addPartType(PartType partType) {
		getSession().saveOrUpdate(partType);
		
	}

	@Override
	public PartType getPartType(long id) {
		// TODO Auto-generated method stub
		return (PartType)getSession().get(PartType.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<PartType> getListPartTypes() {
		// TODO Auto-generated method stub
		return getSession().createSQLQuery("select * from type order by id_type").addEntity(PartType.class).list();
	}

	@Override
	public List<Integer> getAllThickness() {
		// TODO Auto-generated method stub
		return getSession().createSQLQuery("select distinct thickness from particleboard order by 1").list();
	}

	@Override
	public List<Integer> getAllLength() {
		// TODO Auto-generated method stub
		return getSession().createSQLQuery("select distinct length from particleboard order by 1").list();
	}

	@Override
	public List<Integer> getAllWeight() {
		// TODO Auto-generated method stub
		return getSession().createSQLQuery("select distinct weight from particleboard order by 1").list();
	}


	
	
}
