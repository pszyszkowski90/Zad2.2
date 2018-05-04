package model.sort;
import java.util.Comparator;
import model.Offert;

public class AddOffertDateSort implements Comparator<Offert> {
	private String order;
	public AddOffertDateSort (String order) {
		this.order = order;
	}
    @Override
    public int compare(Offert a, Offert b) {
    	if (order == "asc") {
    		return a.getAddOffertDate().compareTo(b.getAddOffertDate());
    	} else {
    		return b.getAddOffertDate().compareTo(a.getAddOffertDate());    		
    	}        
    }
}