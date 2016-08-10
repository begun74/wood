package wood.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import wood.model.DirCustomer;




@Repository("userDao")
public class DAOImpl implements DAO {

	@Autowired
    private SessionFactory sessionFactory;
	
	
	protected Session getSession(){
        return sessionFactory.getCurrentSession();
    }

	@SuppressWarnings("unchecked")
	public DirCustomer getDirCustomer() {
		return (DirCustomer)getSession().createSQLQuery("select * from User order by id desc").addEntity(DirCustomer.class).list();
	}

}
