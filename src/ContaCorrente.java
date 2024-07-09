public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente cliente, int agencia, int numero, double saldo) {
		super(cliente, agencia, numero,saldo);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
    
}
