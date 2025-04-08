package entitie;

import java.util.ArrayList;
import java.util.List;

import entitie.ItemOrder;
import entitiesEnums.orderStatus;

public class Order {

	private int id;
	private List<ItemOrder> listItems = new ArrayList<>();
	private orderStatus orderStatus;
	
	public Order(int id, orderStatus orderStatus) {
		this.id = id;
		this.orderStatus = orderStatus;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void printItemsorders() {
		 for(ItemOrder item: listItems) {
			System.out.println("name dish:"+item.getnameDish()+" | quantity:"+item.getquantity()+
					" | price:$"+item.getprice());
		}
	}
	public orderStatus getorderStatus() {
		return orderStatus;
	}
	public void setorderStatus(orderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}
	public void addList(ItemOrder order) {
		listItems.add(order);
		
	}
	public void removeList(ItemOrder order) {
		listItems.remove(order);
	}
	@Override
	public String toString() {
		return "order [id=" + id + ", listItems=" + listItems + ", orderStatus=" + orderStatus + "]";
	}
		
    public double CalcTotal() {
		return listItems.stream().mapToDouble(ItemOrder:: subTotal).sum();
	}
}
