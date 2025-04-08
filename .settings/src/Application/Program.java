package Application;

public class Program {

	public static void main(String[] args) {
	
			Client client = new Client("carlos", 3313411);
			
			client.addList(new Pedido(0, null));
	}

}
