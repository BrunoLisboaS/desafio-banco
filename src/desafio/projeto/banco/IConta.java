package desafio.projeto.banco;

public interface IConta {
	
	void depositar(double valor);
	
	void sacar(double valor);
	
	void transferir(double valor, Conta ContaDestino);
	
	void imprimirExtrato();
	
}
