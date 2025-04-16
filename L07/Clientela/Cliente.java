package L07.Clientela;

public class Cliente{

    private String nome;
    private String cpf;
    private Endereco endereco;

    Cliente(String nome,String cpf,Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String toString(){
        return "Nome:" + nome + ", CPF:" + cpf + endereco.toString();
    }
}
