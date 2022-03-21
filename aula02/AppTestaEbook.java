
public class AppTestaEbook {
	public static void main(String[] args) {
		Ebook ebook1 = new Ebook("Developers", "Someone", 200);

		System.out.println(ebook1.mostrarDados());
ebook1.avancarPagina();
System.out.println(ebook1.getPaginaAtual());
ebook1.avancarPagina();
System.out.println(ebook1.getPaginaAtual());
ebook1.voltarPagina();
System.out.println(ebook1.getPaginaAtual());

boolean alterou = ebook1.irParaPagina(150);
        if (alterou) {
            System.out.println("Foi para a pÁgina");
        } else {
            System.out.println("Página inválida");
    }
}
}
