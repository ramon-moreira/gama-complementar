import java.util.Scanner;

/* Exercício 3
Escreva um programa que leia um número inteiro digitado pelo usuário e exiba uma sequência de números de 1 até o valor digitado pelo usuário. 
Por exemplo, se o usuário digitar o número 8, o programa deve mostrar
1 2 3 4 5 6 7 8
*/

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero, numero2 = 0;
		System.out.println("Por favor, digite um número, e então a sequência do menor número até o número digitado será exibida:");
		numero = entrada.nextInt();
		while (numero2 < numero) {
			numero2 ++;
			System.out.println(numero2);
		}
		entrada.close();
	}
}
