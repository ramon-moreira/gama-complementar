package etapa1.app;

import java.util.Scanner;

import etapa1.modelo.ContaCorrente;
import etapa1.modelo.ContaEspecial;
import etapa1.util.GerenciaContas;

public class App {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		GerenciaContas conta = new GerenciaContas();
		ContaCorrente c;
		ContaEspecial cE;
		String nome;
		int opcao = 0;
		int saldo = 0, numero = 0, entradaDigitada;
		double salario;
		while (opcao != 4) {
			
				System.out.println("Criação de nova conta:");
		
		System.out.println("Digite 1 para conta corrente...");
		System.out.println("Digite 2 para conta especial...");
		System.out.println("Se preferir, digite 3 para consultar as contas existentes...");
		System.out.println("Se não há nada mais a ser feito, digite 4 para sair.");
		opcao = entrada.nextInt();
		
		switch (opcao) {
		
		case 1:
			
            System.out.println("Digite o nome:");
            nome = entrada.next();
            System.out.println("Digite o número da conta:");
numero = entrada.nextInt();
c = new ContaCorrente(numero, saldo);
c.setNumero(numero);
System.out.println("Digite o saldo inicial:");
saldo = entrada.nextInt();
c.setSaldo(saldo);
		break;
		case 2:
			
			System.out.println("Digite o nome:");
            nome = entrada.next();
            System.out.println("Digite o número da conta:");
            numero = entrada.nextInt();
            System.out.println("Digite o saldo inicial:");
            saldo = entrada.nextInt();
            cE  = new ContaEspecial(numero, saldo);
            conta.adicionar(2);
cE.setNumero(numero);
            cE.setSaldo(saldo);
            case 3:
	System.out.println(conta.exibirDados(numero, saldo));
            case 4:
            	System.out.println("Saindo.");
		default:
            System.out.println();
            break;
 
	}
		}
}
}
	