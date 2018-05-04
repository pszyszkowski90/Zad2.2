package model;

import java.util.ArrayList;

import model.filter.Filter;

public class OffertCollection {

		private ArrayList<Offert> offertList = new ArrayList<Offert>();
		
		public void addOffert(Offert offert) {
			offertList.add(offert);
		}
		
		public ArrayList<Offert> getOffertList(){
			return offertList;
		}
		
		public ArrayList<Offert> filter (Filter filter){
			return filter.applyFilter(this);
		}

		
		
}
