package services;

import entitie.Order;


public class PaymentPix implements CalculatePayment {

	@Override
	public double processPayment(Order order) {
		double total = order.CalcTotal();
		double descont = total * 0.05;
		return total - descont;	
	}

}
