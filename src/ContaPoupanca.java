
public class ContaPoupanca extends Conta{

	ContaPoupanca(Cliente cliente, double saldo) {
		super(cliente, saldo);
		// TODO Auto-generated constructor stub
	}
	private float rendimento;
	
	public float getRendimento() {
		return rendimento;
	}
	public double verRendimento(double rendimento) {
		return rendimento;
	}
	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança  ===");
		imprimirInformacoesComuns();
		
	}
	@Override
	public String toString() {
		return "ContaPoupanca [rendimento=" + rendimento + ", agencia=" + agencia + ", numero=" + numero + ", saldo="
				+ saldo + ", cliente=" + cliente + "]";
	}
	
}
