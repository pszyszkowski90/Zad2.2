package model;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import model.filter.*;
import model.sort.*;


public class Program {

	public static void main(String[] args) {
		OffertCollection offertCollection = getSampleOffertCollection();
		
		TitleSort titleSort = new TitleSort("desc");
		PriceSort priceSort = new PriceSort("desc");
		ProductionYearSort productionYearSort = new ProductionYearSort("desc");
		AddOffertDateSort addOffertDateSort = new AddOffertDateSort("desc");
		
		TitleFilter titleFilter = new TitleFilter("test1");
		PriceFilter priceFilter = new PriceFilter(22000,44000);
		MileageFilter mileageFilter = new MileageFilter(20000, 50000);
		ProductionYearFilter productionYearFilter = new ProductionYearFilter(2003, 2008);
		AddDateFilter addDateFilter = new AddDateFilter(new Date(118, 4, 3, 18, 10), new Date(118, 5, 8, 18, 10));
		
		System.out.println("Sortowanie tytu³");
		offertCollection.getOffertList().sort(titleSort);
		printOffertCollection(offertCollection.getOffertList());
		System.out.println("Sortowanie cena");
		offertCollection.getOffertList().sort(priceSort);
		printOffertCollection(offertCollection.getOffertList());
		System.out.println("Sortowanie rok produkcji");
		offertCollection.getOffertList().sort(productionYearSort);
		printOffertCollection(offertCollection.getOffertList());
		System.out.println("Sortowanie data dodania");
		offertCollection.getOffertList().sort(addOffertDateSort);
		printOffertCollection(offertCollection.getOffertList());
		
		System.out.println("Filtrowanie tytu³");
		printOffertCollection(offertCollection.filter(titleFilter));
		System.out.println("Filtrowanie cena");
		printOffertCollection(offertCollection.filter(priceFilter));
		System.out.println("Filtrowanie przebieg");
		printOffertCollection(offertCollection.filter(mileageFilter));
		System.out.println("Filtrowanie rok produkcji");
		printOffertCollection(offertCollection.filter(productionYearFilter));
		System.out.println("Filtrowanie data dodania");
		printOffertCollection(offertCollection.filter(addDateFilter));
		
	}

	public static void printOffertCollection( ArrayList<Offert> offertList){
		System.out.println("=====================================================================");
		System.out.println("Tytu³ \t|Cena\t\t|Przebieg\t|Rocznik|Data dodania");
		System.out.println("_____________________________________________________________________");
		for(Offert offert:offertList){
			System.out.println(
					offert.getOffertTitle()
					+ "\t|"
					+ offert.getPrice()
					+ "\t|"
					+ offert.getMileage()
					+ "\t|"
					+ offert.getProductionYear()
					+ "\t|"
					+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(offert.getAddOffertDate())
					);
			System.out.println("---------------------------------------------------------------------");
		}		
	}
	
	public static OffertCollection getSampleOffertCollection(){
		OffertCollection offertCollection = new OffertCollection();
		for(Offert o:getSampleOfferts()){
			offertCollection.addOffert(o);
		}
		return offertCollection;
	}
	
	public static ArrayList<Offert> getSampleOfferts(){
		ArrayList<Offert> offerts = new ArrayList<Offert>();
		Random rand = new Random();
		for(int i=1;i<=5;i++){
			Offert o = new Offert();
//			o.setAddOffertDate(new Date(118, 5, i, 18, 10));
			o.setAddOffertDate(new Date());
			o.setMileage(rand.nextInt(100000) + 10000);
			o.setOffertTitle("Test"+i);
			o.setPrice(rand.nextInt(100000) + 10000);
			o.setProductionYear(2000+rand.nextInt(15));
			offerts.add(o);
		}
		return offerts;
	}
}
