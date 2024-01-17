package Task2;

public class Order {
	private OrderItem[] items;

	public double cost() {
		for (int i = 0; i < items.length; i++) {
			return items[i].price();
		}
		return 0;
	}// using binary search approach

	public boolean contains(Product p) {
		// TODO
		return false;
	}

	// get all products based on the given type using linear search
	public Product[] filter(String type) {
		// TODO
		return null;
	}

}
