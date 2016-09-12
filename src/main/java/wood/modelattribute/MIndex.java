package wood.modelattribute;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;



import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import wood.annotation.Loggable;
import wood.model.Particleboard;
import wood.service.WoodService;

@Component
@Scope(value="session", proxyMode=ScopedProxyMode.TARGET_CLASS)
public class MIndex {
	
	List<Long> brands = new LinkedList<Long>();
	
	private int pbListSize = 0;
	private int priceFrom = 0;
	private int priceTo = 0;

	private long time = System.currentTimeMillis();

	
	
	public int getPbListSize() {
		return pbListSize;
	}


	public List<Long> getBrands() {
		return brands;
	}

	public void setBrands(List<Long> brands) {
		this.brands = brands;
	}

	
	@Loggable
	public List<Particleboard> getListParticleboards(WoodService woodService)
	{
		List<Particleboard> pList = new LinkedList<Particleboard>();
		Iterator<Long> iterBrands = getBrands().iterator();
		
		boolean isFinding = false;
		Particleboard particleboard = new Particleboard();
		
		if(iterBrands.hasNext())
		{
			while(iterBrands.hasNext())
			{
				isFinding = true;
				particleboard.setFk_dirBrand(iterBrands.next());
				
				if(priceFrom > priceTo) priceTo = 0 ;
				
				if(priceFrom>0 || priceTo >0)
					pList.addAll( woodService.getAllParticleboards(particleboard, priceFrom, priceTo));
				else
					pList.addAll( woodService.getListParticleboards(particleboard));
			}
		}
		else if(priceFrom>0 || priceTo >0)
		{
			if(priceFrom > priceTo) priceTo = 0 ;
			pList.addAll( woodService.getAllParticleboards(particleboard, priceFrom, priceTo));
		}
		
		if(pList.size()!=0 || isFinding)
		{
			pbListSize = pList.size();
			return pList;
		}
		else
		{
			pList = woodService.getListParticleboards();
			pbListSize = pList.size();
			return pList;
		}

		
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
