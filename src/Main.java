import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o número de clientes que você deseja adicionar");
		int numDeClientes = scan.nextInt();
	    List<Cliente> totalClientes = new ArrayList<>() {{
	    for (int i = 0; i < numDeClientes; i++) {
	    	String nomeCliente = scan.next();
	    	add(new Cliente(nomeCliente));
	    }
	    }};
	    for (Cliente cliente:totalClientes) {System.out.println(cliente.getNome());};
	    
	    Cliente cliente1 = new Cliente("Nina");
	    Conta conta1 = new ContaCorrente(cliente1,15d);
	    
	    System.out.println(conta1);
	    
	    conta1.depositar(100);
	    System.out.println(conta1.getSaldo());
	    conta1.sacar(50);
	    System.out.println(conta1.getSaldo());
	    
	}

}
