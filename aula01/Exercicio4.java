import java.util.Scanner;

/* Exercício 4
Escreva um programa que exiba a tabuada do número digitado pelo usuário.
Por exemplo, se o usuário digitar o valor 5, deve mostrar a tabuada no número 5, como está listado abaixo.
5 x 0 = 0
5 x 1 = 5
5 x 2 = 10
continua até
5 x 10 = 50
*/

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		System.out.println("Por favor, digite um número, em seguida a tabuada do número digitado até o número vezes 10 será exibida:");
		numero = entrada.nextInt();
			for (int contador = 1; contador <= 10; contador ++) {
			System.out.println(numero + " x " + contador + " = " + (contador * numero));
}
	entrada.close();
}
}
