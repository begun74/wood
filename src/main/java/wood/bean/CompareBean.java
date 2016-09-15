package wood.bean;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import wood.model.Particleboard;

@Component
@Scope(value="session", proxyMode=ScopedProxyMode.TARGET_CLASS)
public class CompareBean implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9047408479563795379L;
	
	
	Set<Particleboard> items = new TreeSet<Particleboard>();
	
	
	public Set<Particleboard> getItems() 
	{
		
		return items;
	}
	


	public synchronized  void addParticleboardToCompList(Particleboard p) 
	{
		items.add(p);
	}
	
	public String[][] getArrItems() {
		String[][] mass = new String[6][items.size()];
		
		Iterator<Particleboard> iter = items.iterator();
		
		int c=0;
		
		while(iter.hasNext())
		{
			Particleboard p = iter.next();
			
			mass[0][c] = p.getId()+""; 
			mass[1][c] = p.getDirBrand().getName(); 
			mass[2][c] = p.getThickness()+""; 
			mass[3][c] = p.getLength()+""; 
			mass[4][c] = p.getWeight()+""; 
			mass[5][c] = p.getPrice()+""; 
			
			++c;
		}
		
		return mass;
	}


}
