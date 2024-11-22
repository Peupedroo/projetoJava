import model.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Livro L = new Livro();
        Scanner sc = new Scanner(System.in);
        System.out.println("vc quer entrar no cadastramento ");
        System.out.println("escolha o numero 1 se quiser cadastrar um livro ");

        int escolha = sc.nextInt();
        sc.nextLine(); // Consumir a nova linha deixada pelo nextInt()
        String cont;

        System.out.println("Texto: " + escolha);

        switch (escolha) {
            case 1 -> {
                System.out.println("Voce quer cadastrar um livro ");
                do {
                System.out.println("qual o ISBN do livro");
                L.setISBN(sc.nextInt());
                sc.nextLine();

                System.out.println("qual o numero de paginas do livro");
                L.setnPaginas(sc.nextInt());
                sc.nextLine();

                System.out.println("qual o titulo do livro");
                L.setTitulo(sc.nextLine());

                System.out.println("qual o autor do livro ");
                L.setAutor(sc.nextLine());

                System.out.println("qual o numero de exemplares iguais ");
                L.setExemplares(sc.nextInt());
                sc.nextLine();

                System.out.println("qual a editora do livro ");
                L.setEditora(sc.nextLine());

                String string = L.toString();

                System.out.println(string);


                    System.out.println("vc quer continuar S ou N ");
                cont = sc.nextLine();
                } while (cont.equalsIgnoreCase("S"));
            }
            default -> System.out.println("Opção inválida.");
        }
    }
}
