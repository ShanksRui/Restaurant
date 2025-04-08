package Application;

import java.util.Scanner;

<<<<<<< HEAD
import entities.enums.Status;
import services.PagamentoCartaoCredito;
import services.PagamentoPix;
=======
import entitie.Customer;
import entitie.ItemOrder;
import entitie.Order;
import entitiesEnums.orderStatus;
import services.PaymentCreditCard;
import services.PaymentPix;
>>>>>>> 32cc391 (readjust)

public class Program {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
<<<<<<< HEAD
		    
		    Client mell = new Client("pamella", 23661234);
			Pedido pedido = new Pedido(2, Status.PENDENTE);					
			pedido.addList(new ItemPedido("panqueca de carne",1,28.99));
			mell.addList(pedido);
			
			System.out.println("Dados do cliente e pedido associado");
			System.out.println(mell.toString());
			System.out.println();
			System.out.println("========== RESUMO DO PEDIDO ==========");
			System.out.println("items do pedido");
		   for(Pedido pedid: mell.getPedidos()) {
			   pedid.printItemsPedidos();
		   }
		   System.out.print("total da conta:$");
		   System.out.println(pedido.CalcTotal());
		   System.out.print("payment method|PIX(1) CREDIT(2)|:");
		   int escolha = sc.nextInt();
		   if(escolha == 1) {
			PagamentoPix pix = new PagamentoPix();
		    System.out.println(pix.processarPagamento(pedido));
		   }else if(escolha == 2) {
			   System.out.print("quantidade de parcelamento:");
			   int installment = sc.nextInt();
			   PagamentoCartaoCredito credit = new PagamentoCartaoCredito(installment);
			   System.out.printf("valor de cada parcela:"+"%.2f", credit.processarPagamento(pedido));
		   }else {
			   throw new IllegalArgumentException("modo de pagamento invalido");
		   }
		   
=======
		    System.out.println("Restaurant 🍱");
		    System.out.println("Enter your details (name and CPF)");
		    String name = sc.next();
		    int cpf = sc.nextInt();
		    Customer Customer = new Customer(name, cpf);
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
>>>>>>> 32cc391 (readjust)
		
		   
	}

}
