package fruitSortMain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import FruitData.Fruit;
import FruitData.FruitComparator;

public class Main {

	public static void main(String[] args) {
		List<Fruit> fl = new ArrayList<Fruit>();
		System.out.println("Fruit List (ordered by name)");
		
		Fruit f1 = new Fruit(101, "Apple", 1000);
		fl.add(f1);
		Fruit f2 = new Fruit(102, "Orange", 1500);
		fl.add(f2);
		Fruit f3 = new Fruit(103, "Kiwi", 2000);
		fl.add(f3);
		Fruit f4 = new Fruit(104, "Grape", 2500);
		fl.add(f4);
		Fruit f5 = new Fruit(105, "Mango", 3000);
		fl.add(f5);
		Fruit f6 = new Fruit(106, "Tomato", 3500);
		fl.add(f6);
		Fruit f7 = new Fruit(107, "Lemon", 4000);
		fl.add(f7);
		Fruit f8 = new Fruit(108, "Blueberry", 4500);
		fl.add(f8);
		Fruit f9 = new Fruit(109, "Raspberry", 5000);
		fl.add(f9);
		Fruit f10 = new Fruit(110, "Cherry", 5500);
		fl.add(f10);
		
		Collections.sort(fl, new FruitComparator());
		
		for (Fruit s : fl)
			System.out.println(s.toString());
	}

}
