package services;

import Application.Pedido;

public class PagamentoCartaoCredito implements CalcularPagamento{
	
	

	@Override
	public double processarPagamento(Pedido pedido) {
		double total = pedido.CalcTotal();
		
		
		return null;
	}

}
