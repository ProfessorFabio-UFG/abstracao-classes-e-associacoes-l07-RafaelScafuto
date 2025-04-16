package L07.Faculdade;

public class Departamento {

    private String nome;
    private String sigla;

    Departamento(String nome,String sigla){
        this.nome = nome;
        this.sigla = sigla;
    }

    public String toString(){
        return "\nDepartamento:" + nome + ", sigla do departamento:" + sigla + "\n";
    }

}
