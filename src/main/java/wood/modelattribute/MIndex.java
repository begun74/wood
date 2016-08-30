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
	
	private int priceFrom = 0;
	private int priceTo = 0;

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
			
			if(priceFrom > priceTo) priceTo = priceFrom ;
			
			if(priceFrom>0 || priceTo >0)
				pList.addAll( woodService.getAllParticleboards(particleboard, priceFrom, priceTo));
			else
				pList.addAll( woodService.getListParticleboards(particleboard));
		}
		if(pList.size()!=0 || isFinding)
			return pList;
		else
			return woodService.getListParticleboards();

		
	}
	
	
	public int getPriceFrom() {
		return priceFrom;
	}

	public void setPriceFrom(int priceFrom) {
		this.priceFrom = priceFrom;
	}

	public int getPriceTo() {
		return priceTo;
	}

	public void setPriceTo(int priceTo) {
		this.priceTo = priceTo;
	}

	@Override
	public String toString() {
		return "MIndex [brands=" + brands + ", priceFrom=" + priceFrom
				+ ", priceTo=" + priceTo + "]";
	}


}
