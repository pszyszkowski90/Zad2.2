package model.sort;
import java.util.Comparator;
import model.Offert;

public class ProductionYearSort implements Comparator<Offert> {
	private String order;
	public ProductionYearSort (String order) {
		this.order = order;
	}
    @Override
    public int compare(Offert a, Offert b) {
    	if (order == "asc") {
    		return a.getProductionYear().compareTo(b.getProductionYear());
    	} else {
    		return b.getProductionYear().compareTo(a.getProductionYear());    		
    	}        
    }
}