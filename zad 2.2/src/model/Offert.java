package model;

import java.util.Date;

public class Offert {
		
	private double price;
	private Integer productionYear;
	private Date addOffertDate;
	private String offertTitle;
	private double mileage;
	
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Integer getProductionYear() {
		return productionYear;
	}
	public void setProductionYear(Integer productionYear) {
		this.productionYear = productionYear;
	}
	public Date getAddOffertDate() {
		return addOffertDate;
	}
	public void setAddOffertDate(Date addOffertDate) {
		this.addOffertDate = addOffertDate;
	}
	public String getOffertTitle() {
		return offertTitle;
	}
	public void setOffertTitle(String offertTitle) {
		this.offertTitle = offertTitle;
	}
	public double getMileage() {
		return mileage;
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	
}
