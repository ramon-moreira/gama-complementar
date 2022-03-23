package etapa1.modelo;

public abstract class Conta {
	private int numero, saldo;

	public Conta(int numero, int saldo) {
		this.numero = numero;
		this.setSaldo(saldo);
	}

	public int getSaldo() {
		return saldo;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public String exibirDados() {
		return "Número da conta: " + numero + "Saldo: " + getSaldo();
	}

	public void deposita(int valor) {
this.setSaldo(this.getSaldo() + valor);
	}

	public void sacar(int valor) {
		this.setSaldo(this.getSaldo() - valor);
}
}
