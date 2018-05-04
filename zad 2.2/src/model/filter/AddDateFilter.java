package model.filter;

import java.util.ArrayList;
import java.util.Date;

import model.Offert;
import model.OffertCollection;

public class AddDateFilter implements Filter {
	private Date addDateFrom;
	private Date addDateTo;
	
	public AddDateFilter(Date addDateFrom, Date addDateTo){
		this.addDateFrom = addDateFrom;
		this.addDateTo = addDateTo;
	}
		
	public ArrayList<Offert> applyFilter(OffertCollection offertCollection){
		ArrayList<Offert> filteredOffertList = new ArrayList<Offert>();
		for(Offert offert : offertCollection.getOffertList()) {
			if (offert.getAddOffertDate().after(addDateFrom) && offert.getAddOffertDate().before(addDateTo)) {
				filteredOffertList.add(offert);
			}
		}
		return 	filteredOffertList;	
	}
}