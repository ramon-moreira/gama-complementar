import java.util.Scanner;
/* Exercício 5
Escreva um programa que leia vários números inteiros digitados pelo usuário, até que o usuário digite zero. O zero termina o programa e exibe a soma de todos os valores digitados. 
*/

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero, soma;

		numero = 1;
		soma = 0;
		System.out.println("Digite quantos números desejar, e quando desejar finalizar a execução do programa, digite 0.");
		System.out.println("Feito isso, a soma de todos os números digitados será exibida:");

while (numero != 0) {
	System.out.println("Digite um número a ser somado:");
	numero = entrada.nextInt();
	soma += soma + numero;
}
System.out.println("Resultado final da soma de todos os números digitados é:" + soma);
	}
}
