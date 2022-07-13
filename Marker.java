package trainingday17COLLECTIONSlist;

public class Marker {
	private String brand;
	private int price;
	private String color;
	private boolean isRefillable;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public void setPrice(int Price) {
		this.price=price;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public void setIsRefillable(boolean isReffiable) {
		this.isRefillable=isRefillable;
	}
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public String getColor() {
		return color;
	}
	public boolean getIsRefillable() {
		return isRefillable;
	}
	public Marker(String brand, int price, String color, boolean isRefillable) {
		this.brand=brand;
		this.price=price;
		this.color=color;
		this.isRefillable=isRefillable;
	}
	//public String toString() {
		//return brand+" "+price+" "+color+" "+isRefillable;
	}

	//}

