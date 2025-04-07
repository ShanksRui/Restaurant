package services;

import Application.Pedido;

public class PagamentoCartaoCredito implements CalcularPagamento{
	
	private int installment;
	public PagamentoCartaoCredito(int x) {
		this.setInstallment(x);
	}

	@Override
	public double processarPagamento(Pedido pedido) {		
		return  pedido.CalcTotal() / installment;
	}

	public int getInstallment() {
		return installment;
	}

	public void setInstallment(int installment) {
		if(installment <= 0) {
			throw new IllegalArgumentException("value invalid for installment");
		}
		this.installment = installment;
	}
    
}
