package entitie;

public class ItemOrder {

	private String nameDish;
	private int quantity;
	private double price;
	
	public ItemOrder(String nameDish, int quantity, double price) {
		this.nameDish = nameDish;
		this.quantity = quantity;
		this.price = price;
	}
	public String getnameDish() {
		return nameDish;
	}
	public void setnameDish(String nameDish) {
		this.nameDish = nameDish;
	}
	public int getquantity() {
		return quantity;
	}
	public void setquantity(int quantity) {
		this.quantity = quantity;
	}
	public double getprice() {
		return price;
	}
	public void setprice(double price) {
		this.price = price;
	}
	public double subTotal() {
		return quantity * price;
	}
	@Override
	public String toString() {
		return "ItemOrder [nameDish=" + nameDish + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
}
