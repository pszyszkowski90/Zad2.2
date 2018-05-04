package model.filter;

import java.util.ArrayList;

import model.Offert;
import model.OffertCollection;

public class PriceFilter implements Filter {
	private double priceFrom;
	private double priceTo;
	
	public PriceFilter(double priceFrom, double priceTo){
		this.priceFrom = priceFrom;
		this.priceTo = priceTo;
	}
		
	public ArrayList<Offert> applyFilter(OffertCollection offertCollection){
		ArrayList<Offert> filteredOffertList = new ArrayList<Offert>();
		for(Offert offert : offertCollection.getOffertList())
			if (offert.getPrice() >= priceFrom && offert.getPrice() <= priceTo) {
				filteredOffertList.add(offert);
			}
		return 	filteredOffertList;	
	}
}