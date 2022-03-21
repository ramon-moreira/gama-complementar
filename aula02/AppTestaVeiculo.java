
public class AppTestaVeiculo {
	public static void main(String[] args) {
		Veiculo veiculo1 = new Veiculo("Imaginário1", "Fruto da imaginação1", 20);
		Veiculo veiculo2 = new Veiculo("Imaginário2", "Fruto da imaginação2", 10);

		veiculo1.mostrarDados();
		System.out.println("Consumo :" + veiculo1.getConsumo());

		veiculo2.mostrarDados();
		System.out.println("Consumo :" + veiculo2.getConsumo());
	}
}
