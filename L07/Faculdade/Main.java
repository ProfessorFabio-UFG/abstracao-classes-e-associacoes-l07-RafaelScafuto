package L07.Faculdade;

public class Main {

    public static void main(String[] args) {

        Departamento departamento1 = new Departamento("Instituto de Informática", "INF");
        Departamento departamento2 = new Departamento("Instituto de Matemática e Estatística", "IME");

        Curso curso1 = new Curso("Ciências da Computação", "CC", departamento1);
        Curso curso2 = new Curso("Inteligência Artificial", "IA", departamento1);
        Curso curso3 = new Curso("Matemática", "MM", departamento2);
        Curso curso4 = new Curso("Estatística", "ET", departamento2);

        Aluno aluno1 = new Aluno("Joao", 5394, 2020,curso2);
        Aluno aluno2 = new Aluno("Patricia", 5081, 2021,curso3);
        Aluno aluno3 = new Aluno("Fabio", 7892, 2017,curso1);
        Aluno aluno4 = new Aluno("Pedro", 9900, 2023,curso1);
        Aluno aluno5 = new Aluno("Larissa", 3400, 2016,curso4);


        System.out.println("\n");
        System.out.println(aluno1);
        System.out.println(aluno2);
        System.out.println(aluno3);
        System.out.println(aluno4);
        System.out.println(aluno5);
    }
}
