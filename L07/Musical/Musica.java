package L07.Musical;

public class Musica {

    private String nome;
    private int ano;
    private String tipo;
    private Compositor compositor;

    Musica(String nome,int ano,String tipo,Compositor compositor){
        this.nome = nome;
        this.ano = ano;
        this.tipo = tipo;
        this.compositor = compositor;
    }

    public String toString(){
        return "Nome:" + nome + ", Ano:" + ano + ", Tipo:" + tipo + compositor.toString() + "]";
    }
}
