package wood.modelattribute;

import java.util.LinkedList;
import java.util.List;


public class MIndex {
	
	List<Long> brands = new LinkedList<Long>();


	
	public List<Long> getBrands() {
		return brands;
	}

	public void setBrands(List<Long> brands) {
		this.brands = brands;
	}

	@Override
	public String toString() {
		return "MIndex [brands=" + brands + "]";
	}

	
	
	

}
