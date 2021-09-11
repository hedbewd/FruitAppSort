package FruitData;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit> {

	public int compare(Fruit o1, Fruit o2) {
		return o1.name.compareTo(o2.name);
	}
}