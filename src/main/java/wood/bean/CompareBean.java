package wood.bean;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import wood.model.Particleboard;

@Component
@Scope(value="session", proxyMode=ScopedProxyMode.TARGET_CLASS)
public class CompareBean {
	
	
	Set<Particleboard> items = new TreeSet<Particleboard>();
	
	
	public Set<Particleboard> getItems() {
		return items;
	}


	public synchronized  void addParticleboardToCompList(Particleboard p) {
		items.add(p);
		//System.out.println("items  - "+items);
	}


}
