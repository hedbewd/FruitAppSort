package FruitData;

import java.util.Comparator;

public class Fruit implements Comparable<Fruit> {
	
	public Fruit() {
		super();
	}
	
	public Fruit(int no, String name, int price) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
	}

	int no;
	String name;
	int price;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Data [no=" + no + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Fruit o) {
		return name.compareTo(o.name);
	}
}
