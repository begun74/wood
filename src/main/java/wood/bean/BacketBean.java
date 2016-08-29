package wood.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.*;
		
import org.springframework.stereotype.Service;

@Service
@Scope(value="session", proxyMode=ScopedProxyMode.TARGET_CLASS)
public class BacketBean {

	private int items=0;
	
	
	
	
	
	public int getItems() {
		return items;
	}

	public void setItems(int items) {
		this.items = items;
	}

	@PostConstruct
	void init(){
		System.out.println("BacketBean @PostConstruct ");
	}
	
	@PreDestroy
	void destr() {
		System.out.println("BacketBean @PreDestroy ");
	}


}
