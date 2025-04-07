package Application;

import java.util.Scanner;

import entities.enums.Status;
import services.PagamentoCartaoCredito;
import services.PagamentoPix;

public class Program {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    
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
		   
		
		   
	}

}
