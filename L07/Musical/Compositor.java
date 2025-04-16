package L07.Musical;

public class Compositor {

    private String nome;
    private String nacionalidade;

    Compositor(String nome,String nacionalidade){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    public String toString(){
        return "  [Compositor:" + nome + ", Nacionalidade:" + nacionalidade;
    }
}
