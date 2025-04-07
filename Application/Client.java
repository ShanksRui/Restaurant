package Application;

import java.util.ArrayList;
import java.util.List;

public class Client {

	
	private String nome;
	private int cpf;
	private List<Pedido> listPedidos = new ArrayList<>();
	
	public Client(String nome, int cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidade() {
		return cpf;
	}
	public void setQuantidade(int cpf) {
		this.cpf = cpf;
	}	
    public void addList(Pedido pedido) {
	   listPedidos.add(pedido);

   }
    public void removeList(Pedido pedido) {
	   listPedidos.remove(pedido);
   }
    public List<Pedido> getPedidos() {
    	return new ArrayList<Pedido>(listPedidos);
    }
	@Override
	public String toString() {
		return "Client [nome=" + nome + ", cpf=" + cpf + ", listPedidos=" + listPedidos + "]";
	}
  
}
