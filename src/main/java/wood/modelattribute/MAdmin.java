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
	
	Map<String,String> chbxParts = new HashMap<String,String>();
	
	
	//List<Integer> countSelect = new LinkedList<Integer>();

	Map<String,String> countSelect = new HashMap<String,String>();
	{
		chbxParts.put("1", "1");
	}


		

	public Map<String, String> getChbxParts() {
		return chbxParts;
	}

	public void setChbxParts(Map<String, String> chbxParts) {
		this.chbxParts = chbxParts;
	}

	

	public Map<String, String> getCountSelect() {
		return countSelect;
	}

	public void setCountSelect(Map<String, String> countSelect) {
		this.countSelect = countSelect;
	}

	@Override
	public String toString() {
		return "MAdmin [chbxParts=" + chbxParts + ", countSelect=" + countSelect + "]";
	}

	
	
	

}
