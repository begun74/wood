package wood.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractDAO {
	
	@Autowired
    private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public AbstractDAO() {
		
	}
	
	protected Session getSession(){
        return sessionFactory.getCurrentSession();
    }


}
