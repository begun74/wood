package wood.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Service;

import wood.model.Particleboard;

@Service
@Scope(value="session", proxyMode=ScopedProxyMode.TARGET_CLASS)
public class BacketBean {

	List<Particleboard> items = new ArrayList<Particleboard>();
	private int allPrice=0;
	private int countItems=0;
	
	
	public List<Particleboard> getItems() {
		return items;
	}

	public void setItems(List<Particleboard> items) {
		this.items = items;
	}

	public int getAllPrice() {
		allPrice = 0;
		items.forEach(p -> allPrice+=p.getPrice());
		return allPrice;
	}


	public int getCountItems() {
		//System.out.println("backet items - " + items);
		countItems = items.size();
		return countItems;
	}

	

	@PostConstruct
	void init(){
		//System.out.println("BacketBean @PostConstruct ");
	}
	
	@PreDestroy
	void destr() {
		//System.out.println("BacketBean @PreDestroy ");
	}


}
