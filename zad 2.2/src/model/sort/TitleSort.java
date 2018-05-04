package model.sort;
import java.util.Comparator;
import model.Offert;

public class TitleSort implements Comparator<Offert> {
	private String order;
	public TitleSort (String order) {
		this.order = order;
	}
    @Override
    public int compare(Offert a, Offert b) {
    	if (order == "asc") {
    		return a.getOffertTitle().toLowerCase().compareTo(b.getOffertTitle().toLowerCase());
    	} else {
    		return b.getOffertTitle().toLowerCase().compareTo(a.getOffertTitle().toLowerCase());    		
    	}        
    }
}