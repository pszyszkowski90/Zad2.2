
package model.filter;

import java.util.ArrayList;

import model.Offert;
import model.OffertCollection;

public class ProductionYearFilter implements Filter {
	private Integer productionYearFrom;
	private Integer productionYearTo;
	
	public ProductionYearFilter(Integer productionYearFrom, Integer productionYearTo){
		this.productionYearFrom = productionYearFrom;
		this.productionYearTo = productionYearTo;
	}
		
	public ArrayList<Offert> applyFilter(OffertCollection offertCollection){
		ArrayList<Offert> filteredOffertList = new ArrayList<Offert>();
		for(Offert offert : offertCollection.getOffertList())
			if (offert.getProductionYear() >= productionYearFrom && offert.getProductionYear() <= productionYearTo) {
				filteredOffertList.add(offert);
			}
		return 	filteredOffertList;	
	}
}