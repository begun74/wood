package wood.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import wood.model.DirCustomer;




@Repository("dao")
//@Transactional
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

}
