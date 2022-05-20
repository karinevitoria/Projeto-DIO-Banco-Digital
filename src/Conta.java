
public abstract class Conta implements IConta{

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;	
	
	Conta(Cliente cliente, double saldo){
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public double verSaldo(double saldo) {
		return saldo;
	}

	@Override
	public void sacar(double valor) {
		
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		saldo += valor;
	}

	@Override
	public void transferir(Conta contaDestino, double valor) {
		// TODO Auto-generated method stub
		saldo -= valor;
		contaDestino.saldo += valor;
	}
	protected void imprimirInformacoesComuns() {
		System.out.println(String.format("Titular %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %d", this.saldo));
	}
}
