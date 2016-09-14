package wood.modelattribute;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import wood.model.SelectPart;

@Component
@Scope(value="session", proxyMode=ScopedProxyMode.TARGET_CLASS)
public class MAdmin {
	
	Map<Integer,Long> chbxParts = new HashMap<Integer,Long>();
	
	Map<Integer,Integer> countSelect = new HashMap<Integer,Integer>();
		

	
	public Map<Integer, Long> getChbxParts() {
		return chbxParts;
	}



	public void setChbxParts(Map<Integer, Long> chbxParts) {
		this.chbxParts = chbxParts;
	}



	public Map<Integer, Integer> getCountSelect() {
		return countSelect;
	}



	public void setCountSelect(Map<Integer, Integer> countSelect) {
		this.countSelect = countSelect;
	}



	@Override
	public String toString() {
		return "MAdmin [chbxParts=" + chbxParts + ", countSelect=" + countSelect + "]";
	}

	
	
	

}
