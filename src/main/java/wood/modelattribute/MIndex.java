package wood.modelattribute;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import wood.model.Particleboard;
import wood.service.WoodService;

@Service
@Scope(value="session", proxyMode=ScopedProxyMode.TARGET_CLASS)
public class MIndex {
	
	List<Long> brands = new LinkedList<Long>();

	private long time = System.currentTimeMillis();

	
	public List<Long> getBrands() {
		return brands;
	}

	public void setBrands(List<Long> brands) {
		this.brands = brands;
	}

	public List<Particleboard> getListParticleboards(WoodService woodService)
	{
		List<Particleboard> pList = new LinkedList<Particleboard>();
		Iterator<Long> iterBrands = getBrands().iterator();
		
		boolean isFinding = false;
		
		while(iterBrands.hasNext())
		{
			isFinding = true;
			Particleboard particleboard = new Particleboard();
			particleboard.setFk_dirBrand(iterBrands.next());
			pList.addAll( woodService.getListParticleboards(particleboard));
		}
		if(pList.size()!=0 || isFinding)
			return pList;
		else
			return woodService.getListParticleboards();

		
	}
	
	@Override
	public String toString() {
		return "MIndex  "+time+"  [brands=" + brands + "]";
	}

	
	
	

}
