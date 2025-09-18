package Model;

public class FoodOrder {
	private String name;
	private String address;
	private String food;
	
	public FoodOrder(String name, String address, String food) {
		this.name=name;
		this.address = address;
		this.food = food;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	
}
