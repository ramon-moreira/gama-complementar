/*
Crie a classe veículo, com os atributos modelo, marca e consumo (quantos km/l).
Faça um construtor para inicializar os atributos da classe.
Escreva um método para mostrar na tela os dados do carro (modelo, marca) e outro método para retornar o valor do consumo.
Faça um arquivo com o método main para testar a classe criada, ou seja, criar um objeto e exibir os dados.
*/

public class Veiculo {
	private String modelo;
	private String marca;
	private double consumo;

	public Veiculo(String modelo, String marca, double consumo) {
		this.modelo = modelo;
		this.marca = marca;
		this.consumo = consumo;
	}

	public void mostrarDados() {
		System.out.println("Modelo = " + modelo + "Marca = " + marca);
	}
	
	public double getConsumo() {
		return consumo;
	}
}