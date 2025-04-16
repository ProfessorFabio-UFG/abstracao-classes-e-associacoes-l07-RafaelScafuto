package L07.Clientela;

public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Lucas Almeida Costa", "078.232.450-91", new Endereco("Rua das Acácias",123,"Jardim Primavera","Apto 201 - Bloco B", "São Paulo", "SP"));
        Cliente cliente2 = new Cliente("Juliana Mendes Rocha","145.781.960-30", new Endereco("Avenida Central", 4567,"Centro", "Sala 12 - Ed. Empresarial Tower", "Belo Horizonte", "MG"));
        Cliente cliente3 = new Cliente("Ricardo Silva Pacheco","312.0965.80-09", new Endereco("Rua do Sol",89,"Vila Esperança","Casa 2", "Porto Alegre","RS"));

        System.out.println("\n");
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
    }
}
