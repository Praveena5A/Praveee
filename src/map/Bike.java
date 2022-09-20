package map;

public class Bike { 
	private String brand;
	private int registerNo;
	private String color;
	private int price;
	private boolean isPetrol;
	
	public void setBrand(String b){
		brand=b;
	}
	public String getBrand() {
		return brand;
	}
	public void setRegis(int rn) {
		registerNo=rn;
	
	}
	public int getRegis() {
		return registerNo;
	}
	public void setColor(String c) {
		color=c;
		
	}
	public String getColor() {
		return color;
	}
	public void setPrice(int p) {
		price=p;
	}
	public int getPrice() {
		return price;
	}
	public void setIsPetrol(boolean ip) {
		isPetrol=ip;
	}
	public boolean getIspetrol() {
		return isPetrol;
	}
	public Bike(String b,int rn,String c,int p,boolean ip) {
		brand=b;
		registerNo=rn;
		color=c;
		price=p;
		isPetrol=ip;
	}
	public String toString() {
		return brand+" "+registerNo+" "+color+" "+price+" "+isPetrol;
	
}
}
