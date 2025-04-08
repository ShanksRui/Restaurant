package entitie;

import java.util.ArrayList;
import java.util.List;

import entitie.Order;

public class Customer {

	
	private String name;
	private int cpf;
	private List<Order> listOrders = new ArrayList<>();
	
	public Customer(String name, int cpf) {
		this.name = name;
		this.cpf = cpf;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public int getQuantidade() {
		return cpf;
	}
	public void setQuantidade(int cpf) {
		this.cpf = cpf;
	}	
    public void addList(Order order) {
	   listOrders.add(order);

   }
    public void removeList(Order Order) {
	   listOrders.remove(Order);
   }
    public List<Order> getOrders() {
    	return new ArrayList<Order>(listOrders);
    }
	@Override
	public String toString() {
		return "Customer [name=" + name + ", cpf=" + cpf + ", listOrders=" + listOrders + "]";
	}
  
}
