package wood.bean;


import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

import wood.model.Particleboard;

@Component
@Scope(value="session", proxyMode=ScopedProxyMode.TARGET_CLASS)
public class BacketBean implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2747764309294477736L;
	
	
	List<Particleboard> items = new LinkedList<Particleboard>();
	Map<Particleboard,Integer> itemsTM = new TreeMap<Particleboard,Integer>();
	
	private int allPrice=0;
	private int countItems=0;
	
	
	public synchronized Map<Particleboard, Integer> getItemsTM() {
		return itemsTM;
	}

	public synchronized  void addParticleboardToBacket(Particleboard p) {
		items.add(p);
		try {
			itemsTM.put(p, (itemsTM.get(p)).intValue()+1);
		}
		catch (NullPointerException nexc)
		{
			itemsTM.put(p,1);
		}
		//System.out.println("itemsTM  - "+itemsTM);
	}

	public synchronized List<Particleboard> getItems() {
		
		return items;
	}

	public synchronized void setItems(List<Particleboard> items) {
		this.items = items;
	}

	public synchronized  int getAllPrice() {
		allPrice = 0;
		items.forEach(p -> allPrice+=p.getPrice());
		return allPrice;
	}


	public synchronized int getCountItems() {
		
		countItems = items.size();
		return countItems;
	}

	
	public  synchronized  void remPboardFromBacket (Long id) {

		Iterator<Particleboard> iterItems = items.iterator();

		Particleboard p_to_remove = null;
		
		while(iterItems.hasNext())
		{
			Particleboard p = iterItems.next();
			if(p.getId() == id)
				p_to_remove = p;
		}
		
		items.remove(p_to_remove);
		
		try {
			itemsTM.replace(p_to_remove, (itemsTM.get(p_to_remove)).intValue()-1);
			if(itemsTM.get(p_to_remove) == 0)
				itemsTM.remove(p_to_remove);
		}
		catch (NullPointerException nexc)
		{
			//itemsTM.put(p,1);
		}

		//System.out.println("itemsTM  - "+itemsTM);
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
