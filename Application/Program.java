package Application;

import java.util.Scanner;


import entitie.Customer;
import entitie.ItemOrder;
import entitie.Order;
import entitiesEnums.orderStatus;
import services.PaymentCreditCard;
import services.PaymentPix;


public class Program {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    System.out.println("Restaurant 🍱");
		    System.out.println("Enter your details (name and CPF)");
		    String name = sc.next();
		    int cpf = sc.nextInt();
		    Customer customer = new Customer(name, cpf);
			Order order = new Order(1, orderStatus.PENDING);
			System.out.println("Order status: "+order.getorderStatus());
			System.out.println("Enter your details(name, quantity and price)");
			String dish = sc.next();
			int quantity = sc.nextInt();
			double price = sc.nextDouble();
			order.addList(new ItemOrder(dish, quantity, price));
			Customer.addList(order);
			System.out.println(order.getorderStatus().PREPARATION);
			
			System.out.println("Customer data and associated order");
			System.out.println(Customer.toString());
			System.out.println();
			System.out.println("========== ORDER SUMMARY ==========");
			System.out.println("order items");
		   for(Order pedid: Customer.getOrders()) {
			   pedid.printItemsorders();
		   }
		   System.out.print("total price:$");
		   System.out.println(order.CalcTotal());
		   System.out.println("With Pix you get a 5% discount and with credit you"
		   		+ " can pay in up to 4 installments");

		   System.out.print("payment method|PIX(1) CREDIT(2)|:");
		   int choice= sc.nextInt();
		   if(choice == 1) {
			PaymentPix pix = new PaymentPix();
		    System.out.println(pix.processPayment(order));
		   }else if(choice == 2) {
			   System.out.print("installment amount:");
			   int installment = sc.nextInt();
			   PaymentCreditCard credit = new PaymentCreditCard(installment);
			   System.out.printf("value of each installment:"+"%.2f", credit.processPayment(order));
		   }else {
			   throw new IllegalArgumentException("invalid payment method");
		   }
		   System.out.println(order.getorderStatus().FINALIZED);
		   System.out.println("========================================");
		
		   
	}

}
