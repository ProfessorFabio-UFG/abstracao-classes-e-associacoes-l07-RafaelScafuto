package L07.Empresarial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n===Cadastro da Empresa===");
        System.out.println("Digite o CNPJ:");
        String cnpj = scanner.nextLine();

        System.out.println("Digite a Razao Social:");
        String razao = scanner.nextLine();

        System.out.println("\n===Cadastro de Endereco===");
        System.out.println("Rua:");
        String rua = scanner.nextLine();

        System.out.print("Número: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // limpar buffer sempre depois de ler numeros

        System.out.print("Bairro: ");
        String bairro = scanner.nextLine();

        System.out.print("Complemento: ");
        String complemento = scanner.nextLine();

        System.out.print("Cidade: ");
        String cidade = scanner.nextLine();

        System.out.print("Estado: ");
        String estado = scanner.nextLine();

        Endereco endereco = new Endereco(rua,numero,bairro,complemento,cidade,estado);
        Empresa empresa = new Empresa(cnpj,razao,endereco);

        System.out.println("\n===Cadastro de Empregado===");
        System.out.println("Nome:");
        String nome = scanner.nextLine();

        System.out.println("Matricula:");
        int matricula = scanner.nextInt();
        scanner.nextLine();

        Empregado empregado = new Empregado(nome,matricula,empresa);

        System.out.println("\n===Dados Cadastrados===");
        System.out.println(empregado);

        scanner.close();
    }
}
