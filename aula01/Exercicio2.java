import java.util.Scanner;

/*
Exercício 2
A prefeitura do Rio de Janeiro abriu uma linha de crédito para os funcionários estatutários. Entretanto, o valor máximo da prestação não poderá ultrapassar 30% do salário bruto. Faça um programa que leia o salário bruto e o valor da prestação e informe se o empréstimo pode ou não ser concedido.
*/

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double salarioBruto, prestacao;
		System.out.println("Por favor, digite o valor do seu salário bruto:");
		salarioBruto = entrada.nextDouble();
		System.out.println("Por favor, digite o valor da prestação:");
		prestacao = entrada.nextDouble();
		if (prestacao < salarioBruto * 30 / 100) {
System.out.println(")Ok, você pode adquirir o empréstimo!");
}else{
		System.out.println("Desculpe, você não pode adquirir o empréstimo...");
	}
	entrada.close();
}
}
