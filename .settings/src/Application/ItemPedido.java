package Application;

public class ItemPedido {

	private String nomePrato;
	private int quantidade;
	private double preço;
	
	public ItemPedido(String nomePrato, int quantidade, double preço) {
		this.nomePrato = nomePrato;
		this.quantidade = quantidade;
		this.preço = preço;
	}
	public String getNomePrato() {
		return nomePrato;
	}
	public void setNomePrato(String nomePrato) {
		this.nomePrato = nomePrato;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getpreço() {
		return preço;
	}
	public void setpreço(double preço) {
		this.preço = preço;
	}
	@Override
	public String toString() {
		return "ItemPedido [nomePrato=" + nomePrato + ", quantidade=" + quantidade + ", preço=" + preço + "]";
	}
	
	public double subTotal() {
		return quantidade * preço;
	}
	
}
