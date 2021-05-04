package game;

public class Campaign {
private int discount;
private double unitPrice;
private String name;
private double afterDiscountPrice;
 public Campaign () {
	 
 }
public Campaign(int discount, double unitPrice, String name, double afterDiscountPrice) {
	super();
	this.discount = discount;
	this.unitPrice = unitPrice;
	this.name = name;
	this.afterDiscountPrice = afterDiscountPrice;
}
public int getDiscount() {
	return discount;
}
public void setDiscount(int discount) {
	this.discount = discount;
}
public double getUnitPrice() {
	return unitPrice;
}
public void setUnitPrice(double unitPrice) {
	this.unitPrice = unitPrice;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getAfterDiscountPrice() {
	return this.unitPrice - (this.unitPrice * this.discount/100);
}
}
