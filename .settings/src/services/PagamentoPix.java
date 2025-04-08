package services;

import Application.Pedido;

public class PagamentoPix implements CalcularPagamento {

	@Override
	public double processarPagamento(Pedido pedido) {
		double total = pedido.CalcTotal();
		double descont = total * 0.5;
		return total - descont;	
	}

}
