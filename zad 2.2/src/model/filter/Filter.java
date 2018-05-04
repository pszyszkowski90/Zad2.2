package model.filter;

import java.util.ArrayList;

import model.Offert;
import model.OffertCollection;

public interface Filter {
	public ArrayList<Offert> applyFilter(OffertCollection offertCollection);
}
