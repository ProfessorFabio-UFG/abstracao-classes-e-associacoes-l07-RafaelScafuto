package L07.Faculdade;

public class Curso {

    private String nome;
    private String sigla;
    private Departamento departamento;

    Curso(String nome,String sigla,Departamento departamento){
        this.nome = nome;
        this.sigla = sigla;
        this.departamento = departamento;
    }

    public String toString(){
        return "\nNome do curso:" + nome + ", Sigla do curso:" + sigla + departamento.toString();
    }
}
