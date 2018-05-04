
package model.filter;

import java.util.ArrayList;

import model.Offert;
import model.OffertCollection;

public class MileageFilter implements Filter {
	private double mileageFrom;
	private double mileageTo;
	
	public MileageFilter(double mileageFrom, double mileageTo){
		this.mileageFrom = mileageFrom;
		this.mileageTo = mileageTo;
	}
		
	public ArrayList<Offert> applyFilter(OffertCollection offertCollection){
		ArrayList<Offert> filteredOffertList = new ArrayList<Offert>();
		for(Offert offert : offertCollection.getOffertList())
			if (offert.getMileage() >= mileageFrom && offert.getMileage() <= mileageTo) {
				filteredOffertList.add(offert);
			}
		return 	filteredOffertList;	
	}
}