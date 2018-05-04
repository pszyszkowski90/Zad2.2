package model.filter;

import java.util.ArrayList;

import model.Offert;
import model.OffertCollection;

public class TitleFilter implements Filter {
	private String searchString;
	
	public TitleFilter(String searchString){
		this.searchString = searchString;
	}
		
	public ArrayList<Offert> applyFilter(OffertCollection offertCollection){
		ArrayList<Offert> filteredOffertList = new ArrayList<Offert>();
		for(Offert offert : offertCollection.getOffertList())
			if (offert.getOffertTitle().toLowerCase().contains(searchString.toLowerCase())) {
				filteredOffertList.add(offert);
			}
		return 	filteredOffertList;	
	}
}
