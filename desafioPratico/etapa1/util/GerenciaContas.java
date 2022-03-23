package etapa1.util;

import java.util.ArrayList;
import java.util.Iterator;

import etapa1.modelo.ContaCorrente;
import etapa1.modelo.ContaEspecial;

public class GerenciaContas {
private ArrayList<ContaCorrente> contaCorrente;
private ArrayList<ContaEspecial> contaEspecial;

public GerenciaContas () {
	contaCorrente = new ArrayList<>();
	contaEspecial = new ArrayList<>();
}

public void adicionarConta(int opcao) {
	System.out.println("Por favor, escolha o tipo de conta a ser adicionada. Digite 1 para conta corrente, ou 2 para conta especial:");
	if (opcao == 1) {
		System.out.println("Opção escolhida: Criação de conta corrente.");
		ContaCorrente c;
		contaCorrente.add(c);
	}else if (opcao == 2) {
		System.out.println("Opção escolhida: Criação de conta especial.");
		ContaEspecial c;
		contaCorrente.add(c);
	} else {
System.out.println("Opção inválida.");
	}
}

public void removerConta(int opcao) {
	
}
}
