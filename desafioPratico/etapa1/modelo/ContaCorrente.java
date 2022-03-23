package etapa1.modelo;

public class ContaCorrente extends Conta {

	public ContaCorrente(int numero, int saldo) {
		super(numero, saldo);
	}
	
	@Override
	public void sacar(int valor) {
		if ((getSaldo() >= valor)) {
			setSaldo(getSaldo() - valor);
		}
	}
}
