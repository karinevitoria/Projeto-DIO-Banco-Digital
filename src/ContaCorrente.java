
public class ContaCorrente extends Conta{

	ContaCorrente(Cliente cliente, double saldo) {
		super(cliente, saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente  ===");
		imprimirInformacoesComuns();
	}

	@Override
	public String toString() {
		return "ContaCorrente [agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + ", cliente=" + cliente
				+ "]";
	}

	
	
}
