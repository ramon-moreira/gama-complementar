package etapa1.util;

import java.util.ArrayList;

import etapa1.modelo.Conta;
import etapa1.modelo.ContaCorrente;
import etapa1.modelo.ContaEspecial;

public class GerenciaContas{
	private ArrayList<ContaCorrente> contaCorrente;
	private ArrayList<ContaEspecial> contaEspecial;

	
	public GerenciaContas() {
		contaCorrente = new ArrayList<>();
		contaEspecial = new ArrayList<>();
	}
	
	public void adicionar(int opcao) {
		if (opcao == 1) {
			ContaCorrente c = null;
			contaCorrente.add(c);
		}else if (opcao == 2) {
			ContaEspecial cE = null;
			contaEspecial.add(cE);
		} else {
			System.out.println("Opção inválida.");
		}
	}

	public void removerConta(int opcao) {
		System.out.println("Escolha qual conta você quer remover. Digite 1 para corrente, ou 2 para especial:");
		if (opcao == 1) {
			System.out.println("Essa é a lista de contas corrente, qual você deseja remover?:");
			for (int i = 0; i < contaCorrente.size(); i ++) {
				contaCorrente.get(i);
			}
}else if(opcao == 2) {
				System.out.println("Essa é a lista de contas especiais. Qual você quer remover?:");
				for (int i = 0; i < contaEspecial.size(); i ++) {
					contaEspecial.get(i);
				}
			} else {
				System.out.println("Opção inválida.");
			}
		}

	public ArrayList<ContaCorrente> getContaCorrente() {
		return contaCorrente;
	}

	public void setContaCorrente(ArrayList<ContaCorrente> contaCorrente) {
		this.contaCorrente = contaCorrente;
	}

	public ArrayList<ContaEspecial> getContaEspecial() {
		return contaEspecial;
	}

	public void setContaEspecial(ArrayList<ContaEspecial> contaEspecial) {
		this.contaEspecial = contaEspecial;
	}
	
	public String exibirDados(int numero, int saldo) {
		return "Número da conta: " + numero + "Saldo: " + saldo;
	}

}
