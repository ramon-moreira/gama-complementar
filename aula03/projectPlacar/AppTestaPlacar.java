/*  
    Dependendo do contexto, temos 3 formas diferentes de referência para o construtor
    
    Placar(); -  em outra classe (App)
    super();  -  quando temos herança (subclasse chamando o construtor da superclasse)
    this();   -  dentro da mesma classe, usando um construtor sobrecarregado
   
*/


public class AppTestaPlacar {
    public static void main(String[] args) {
        Placar placar1 = new Placar();
        Placar placar2 = new Placar("Sao Paulo","Corinthians");
        Placar placar3 = new Placar("Sao Paulo","Corinthians", 3, 0);

        System.out.println( placar1 );
        System.out.println( placar2 );
        System.out.println( placar3 );
    }
}
