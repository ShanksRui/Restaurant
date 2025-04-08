package Application;

import java.util.ArrayList;
import java.util.List;

import entities.enums.Status;

public class Pedido {

	private int id;
	private List<ItemPedido> listItems = new ArrayList<>();
	private Status status;
	
	public Pedido(int id, Status status) {
		this.id = id;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<ItemPedido> getList() {
		return listItems = new ArrayList<ItemPedido>();
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public void addList(ItemPedido pedido) {
		listItems.add(pedido);
	}
	public void removeList(ItemPedido pedido) {
		listItems.remove(pedido);
	}
	@Override
	public String toString() {
		return "Pedido [id=" + id + ", listItems=" + listItems + ", status=" + status + "]";
	}
	public double CalcTotal() {
		return listItems.stream().mapToDouble(ItemPedido:: subTotal).sum();
	}
}
