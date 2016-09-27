package wood.modelattribute;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import wood.annotation.Loggable;
import wood.model.PartType;
import wood.model.Particleboard;
import wood.service.WoodService;

@Component
@Scope(value="session", proxyMode=ScopedProxyMode.TARGET_CLASS)
public class MIndex implements Serializable, Cloneable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3260524929160705035L;
	
	

	List<Long> brands = new LinkedList<Long>();
	
	private int pbListSize = 0;
	private Double priceFrom = 0.0;
	private Double priceTo = 0.0;
	private Integer pageNumber = 0;
	private Long pg = null;
	private Integer thickness;
	private Integer length;
	private Integer weight;
	private PartType partType = null;

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

	
	public Long getPg() {
		return pg;
	}


	public void setPg(Long pg) {
		this.pg = pg;
	}

	

	

	public Integer getThickness() {
		return thickness;
	}


	public void setThickness(Integer thickness) {
		this.thickness = thickness;
	}


	public Integer getLength() {
		return length;
	}


	public void setLength(Integer length) {
		this.length = length;
	}


	public Integer getWeight() {
		return weight;
	}


	public void setWeight(Integer weight) {
		this.weight = weight;
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

	

	public PartType getPartType() {
		return partType;
	}


	public void setPartType(PartType partType) {
		this.partType = partType;
	}

/*
	@Loggable
	public List<Particleboard> getListParticleboards(WoodService woodService)
	{
		List<Particleboard> pList = new LinkedList<Particleboard>();
		Iterator<Long> iterBrands = getBrands().iterator();
		
		boolean isFinding = false;
		Particleboard particleboard = new Particleboard();
		
		if(pg != null)
		{
			particleboard.setFk_type(pg);
			setPartType(woodService.getPartType(pg));
		}
		else
			setPartType(null);
		
			particleboard.setThickness(thickness);
			particleboard.setWeight(weight);
			particleboard.setLength(length);
			
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
					pList.addAll( woodService.getListParticleboards(particleboard, null));
			}
		}
		else if(priceFrom>0 || priceTo >0)
		{
			if(priceFrom > priceTo) priceTo = 0.0 ;
			pList.addAll( woodService.getAllParticleboards(particleboard, priceFrom, priceTo));
		}
		
		pList.addAll( woodService.getListParticleboards(particleboard, null));
		
		return pList;
	}
	
*/
	@Loggable
	public List<Particleboard> getListParticleboards2(WoodService woodService)
	{
		List<Particleboard> pList = new LinkedList<Particleboard>();
		Iterator<Long> iterBrands = getBrands().iterator();
		
		boolean isFinding = false;
		Collection<Criterion> criterions = new LinkedList<Criterion>();
		
		Particleboard particleboard = new Particleboard();
		
		
		if(pg != null)
		{
			particleboard.setFk_type(pg);
			setPartType(woodService.getPartType(pg));
		}
		else
			setPartType(null);
		
			particleboard.setThickness(thickness);
			particleboard.setWeight(weight);
			particleboard.setLength(length);
		
		if((priceFrom>0 && priceTo>0) && priceFrom < priceTo)
			criterions.add( Restrictions.between("price", priceFrom, priceTo));
		else if(priceFrom>0 && priceTo == 0)
			criterions.add( Restrictions.ge("price", priceFrom));
		else if(priceFrom == 0 && priceTo >0)
			criterions.add( Restrictions.le("price", priceTo));

		if(getBrands().size() >0)
			criterions.add( Restrictions.in("fk_dirBrand",getBrands().toArray()));
			
		
			
		pList.addAll( woodService.getListParticleboards(particleboard, criterions));
		
		
		return pList;
	}

	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof MIndex)
		{
			
		}
		
		return false;
		
	}

	@Override
	public String toString() {
		return "MIndex [brands=" + brands + ", priceFrom=" + priceFrom + ", priceTo=" + priceTo + ", pageNumber="
				+ pageNumber + "]";
	}


	


}
