package etapa1.modelo;

public class ContaEspecial extends Conta{
private int limite = 16000;

public ContaEspecial(int numero, int saldo, int limite) {
	super(numero, saldo);
	this.limite = limite;
}
	
	@Override
	public void sacar(int valor) {
		if (getSaldo() + limite <= valor) {
			limite = limite - valor;
			System.out.println("Saque realizado com sucesso. Seu saldo agora é:" + limite);
		}else {
			System.out.println("Desculpe, não há saldo suficiente.");
		}
	}
}
