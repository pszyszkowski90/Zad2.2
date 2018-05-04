package model.sort;
import java.util.Comparator;
import model.Offert;

public class PriceSort implements Comparator<Offert> {
	private String order;
	public PriceSort (String order) {
		this.order = order;
	}
    @Override
    public int compare(Offert a, Offert b) {
    	if (order == "asc") {
    		return a.getPrice() > b.getPrice() ? 1 : a.getPrice() == b.getPrice() ? 0 : -1;
    	} else {
    		return a.getPrice() > b.getPrice() ? -1 : a.getPrice() == b.getPrice() ? 0 : 1;    		
    	}
        
    }
}