/*
Considere que você está desenvolvendo um aplicativo de livro eletrônico. 
Você deve criar uma classe chamada Ebook com os seguintes atributos:
título, autor, total de páginas e número da página atual.
A classe deve ter os seguintes métodos:
Avançar uma página
Voltar uma página
Mudar para uma página informada
Mostrar o número da página atual
Mostrar os dados do livro

Escreva  o app main para criar um objeto e testar os métodos.
*/

public class Ebook {
	private String titulo, autor;
	private int totalPagina, paginaAtual;

	public Ebook(String titulo, String autor, int totalPagina) {
		this.titulo = titulo;
		this.autor = autor;
		if (totalPagina > 0){
		this.totalPagina = totalPagina;
		}
	}

	public int getPaginaAtual() {
		return paginaAtual;
	}
	
	public void avancarPagina() {
		if (paginaAtual < totalPagina) {
			paginaAtual++;
		}
	}

	public void voltarPagina() {
		if (paginaAtual > 0) {
			paginaAtual--;
		}
	}

	public boolean irParaPagina(int pagina) {
		if (pagina >= 0 && pagina <= totalPagina) {
			paginaAtual = pagina;
			return true;
		}
		return false;
	}

	public String mostrarDados() {
		return titulo + ", " + autor + ", " + totalPagina;
	}
}
