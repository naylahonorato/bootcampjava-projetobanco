public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente, int agencia, int numero, double saldo) {
		super(cliente,agencia,numero,saldo);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}
}
    

