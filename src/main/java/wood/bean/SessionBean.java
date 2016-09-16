package wood.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;



@Service
@Scope("session")
public class SessionBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3979669810819603719L;
	
	private long time = System.currentTimeMillis();
	
	private String username ="";
	
	public static final String ADD_BRAND="5"; 
	public static final String ADD_COLOR="1"; 
	public static final String ADD_PARTICLEBOARD="2"; 
	public static final String ADD_PHOTO="4"; 
	public static final String PROCESS_FILE="3"; 
	public static final String VIEW_ORDERS="6"; 
	
	
	@PostConstruct
	void init(){
		//System.out.println("SessionBean @PostConstruct "+time);
	}
	
	@PreDestroy
	void destr() {
		//System.out.println("SessionBean @PreDestroy "+time);
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	
	
}
