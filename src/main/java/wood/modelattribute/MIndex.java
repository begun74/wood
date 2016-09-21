package wood.modelattribute;

import java.io.Serializable;
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
public class MIndex implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3260524929160705035L;
	
	

	List<Long> brands = new LinkedList<Long>();
	
	private int pbListSize = 0;
	private Double priceFrom = 0.0;
	private Double priceTo = 0.0;
	private Integer pageNumber = 0;

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
				
				if(priceFrom > priceTo) priceTo = 0.0 ;
				
				if(priceFrom>0 || priceTo >0)
					pList.addAll( woodService.getAllParticleboards(particleboard, priceFrom, priceTo));
				else
					pList.addAll( woodService.getListParticleboards(particleboard));
			}
		}
		else if(priceFrom>0 || priceTo >0)
		{
			if(priceFrom > priceTo) priceTo = 0.0 ;
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
	
	
	public Double getPriceFrom() {
		return priceFrom;
	}

	public void setPriceFrom(Double priceFrom) {
		if(priceFrom == null) priceFrom=0.0;
		this.priceFrom = priceFrom;
	}

	public Double getPriceTo() {
		return priceTo;
	}

	public void setPriceTo(Double priceTo) {
		if(priceTo == null) priceTo=0.0;
		this.priceTo = priceTo;
	}
	
	
	public Integer getPageNumber() {
		return pageNumber;
	}


	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}


	@Override
	public String toString() {
		return "MIndex [brands=" + brands + ", priceFrom=" + priceFrom + ", priceTo=" + priceTo + ", pageNumber="
				+ pageNumber + "]";
	}


	


}
