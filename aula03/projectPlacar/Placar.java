/*
Crie uma classe chamada Placar, que representa o placar de um jogo de futebol. Pense quais atributos devem ser adicionados à classe, e faça 3 construtores:

– Um construtor padrão (default, sem parâmetros);
– Um construtor que tenha apenas os nomes dos times do jogo (mantendo o placar em 0 a 0);
– Um construtor que defina os nomes dos times e o placar do jogo;

Crie no main três objetos do tipo placar, um para cada tipo de construtor, e exiba os dados do placar da seguinte forma: 	
Nome do Time1 Gols X Gols Nome do Time2.
*/

public class Placar {
    private String time1, time2;
    private int golsTime1, golsTime2;

    public Placar() {
    /*  time1 = "Time da casa";
        time2 = "Visitante";
        golsTime1 = 0;
        golsTime2 = 0; */
        this("Time da casa", "Visitante");  //utiliza o construtor com 2 parametros
    }

    public Placar(String nomeTime1, String nomeTime2) {
        time1 = nomeTime1;
        time2 = nomeTime2;
        golsTime1 = 0;
        golsTime2 = 0;
    }

    public Placar(String nomeTime1, String nomeTime2, int golsTime1, int golsTime2) {
        time1 = nomeTime1;
        time2 = nomeTime2;
        this.golsTime1 = golsTime1;
        this.golsTime2 = golsTime2;
    }

    @Override
    public String toString() {
        return time1 + " " + golsTime1 + " X " + golsTime2 + " " + time2;
    }

}
