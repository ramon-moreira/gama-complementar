import java.util.Scanner;

/* Faça um programa que leia duas notas de um aluno, calcule e mostre a média aritmética do aluno.*/

public class Exercicio1 {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		int nota1, nota2, media;
		System.out.println("Por favor, digite a primeira nota:");
nota1 = entrada.nextInt();
System.out.println("Por favor, digite a segunda nota:");
nota2 = entrada.nextInt();
media = (nota1 + nota2)/2;
System.out.println("Sua nota final é: " + media);
entrada.close();
	}
}
