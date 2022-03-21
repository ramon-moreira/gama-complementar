

/*
Construir uma classe para representar um funcionário com os seguintes atributos: nome, horas trabalhadas e valor pago por hora trabalhada. Implementar um método para calcular e retornar o salário final de um funcionário e um método para exibir os dados do funcionário.

Criar uma subclasse para representar um funcionário sênior. A diferença entre eles é que um funcionário sênior recebe um bônus a cada 10 horas trabalhadas. O bônus é um atributo do funcionário sênior. Sobrescreva os métodos calcularSalario() e exibirDados() para esta regra.

Criar uma classe AppFuncionario para instanciar objetos da classe Funcionario e Sênior e realizar chamada a seus métodos.
*/

public class AppTestaFuncionario {
	public static void main(String[] args) {
		Funcionario f = new Funcionario("Pietro", 48, 50);
Senior s = new Senior("Carlos", 22, 50, 50);

		f.exibirDados();
		s.exibirDados();
		
	}
}
