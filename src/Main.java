public class Main {
    public static void main(String[] args) {

        Cliente maria = new Cliente();
		maria.setNome("Maria");

        Conta cc = new ContaCorrente(maria,001,1010, 100);
		Conta poupanca = new ContaPoupanca(maria,002,2020,50);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
        
    }

