package wood.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;



@Service
@Scope("session")
public class SessionBean {
	
	private long time = System.currentTimeMillis();
	
	
	
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
