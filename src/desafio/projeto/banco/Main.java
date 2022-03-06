package desafio.projeto.banco;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente lisboa = new Cliente();
		lisboa.setNome("Lisboa");
		
		Conta cc = new ContaCorrente(lisboa);
		Conta pp = new ContaPoupanca(lisboa);
				
		cc.depositar(100);		
		cc.transferir(50, pp);
		pp.depositar(100);
		cc.sacar(25);
		cc.imprimirExtrato();
		pp.imprimirExtrato();
		
	}

}
