package services;

import entitie.Order;

public class PaymentCreditCard implements CalculatePayment{
	
	private int installment;
	public PaymentCreditCard(int x) {
		this.setInstallment(x);
	}

	@Override
	public double processPayment(Order order) {		
		return  order.CalcTotal() / installment;
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
