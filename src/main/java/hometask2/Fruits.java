package hometask2;

public class Fruits {
	String name;
	double price;
	@Override
	public String toString() {
		return "Fruits [name=" + name + ", price=" + price + "]";
	}

	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public Fruits(String name, int i) {
		super();
		this.name = name;
		this.price = i;
	}
	

}
