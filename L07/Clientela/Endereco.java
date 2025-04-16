package L07.Clientela;

public class Endereco{

    private String rua;
    private int numero;
    private String bairro;
    private String complemento;
    private String cidade;
    private String estado;

    Endereco(String rua,int numero,String bairro,String complemento,String cidade,String estado){
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.complemento = complemento;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String toString(){
        return "\nRua:" + rua + ", Número:" + numero + ", Bairro:" + bairro +
         ", Complemento:" + complemento + ", Cidade:" + cidade + ", Estado:" + estado + "\n";
    }


}
