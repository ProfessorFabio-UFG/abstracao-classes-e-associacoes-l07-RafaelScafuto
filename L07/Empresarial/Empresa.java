package L07.Empresarial;

public class Empresa {

    private String cnpj;
    private String razao;
    private Endereco endereco;

    Empresa(String cnpj,String razao,Endereco endereco){
        this.cnpj = cnpj;
        this.razao = razao;
        this.endereco = endereco;
    }

    public String toString(){
        return "\nCPNJ:" + cnpj + ", Razao:" + razao + endereco.toString();
    }
}
