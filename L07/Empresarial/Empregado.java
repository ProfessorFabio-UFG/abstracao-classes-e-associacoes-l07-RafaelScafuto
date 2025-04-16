package L07.Empresarial;

public class Empregado {

    private String nome;
    private int matricula;
    private Empresa empresa;

    Empregado(String nome, int matricula, Empresa empresa){
        this.nome = nome;
        this.matricula = matricula;
        this.empresa = empresa;
    }

    public String toString(){
        return "Nome:" + nome + ", Matricula:" + matricula + empresa.toString();
    }
}
