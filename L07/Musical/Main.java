package L07.Musical;

public class Main {

    public static void main(String[] args) {

        Compositor compositor1 = new Compositor("Michael Jackson", "Estadunidense");
        Compositor compositor2 = new Compositor("Pitbull","Estadunidense");
        Compositor compositor3 = new Compositor("Eminem", "Estadunidense");

        Musica musica1 = new Musica("Billie Jean", 1983, "Pop", compositor1);
        Musica musica2 = new Musica("Give me everything", 2011, "Pop", compositor2);
        Musica musica3 = new Musica("The real Slim Shady", 2000, "Rap", compositor3);

        System.out.println("\n");
        System.out.println(musica1);
        System.out.println(musica2);
        System.out.println(musica3);


    }
}
