import model.*;
import service.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("vc quer entrar no cadastramento ");
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Cadastrar Livro");
        System.out.println("2 - Cadastrar Editoraa");
        System.out.println("3 - Cadastrar Usuárioo");
        System.out.println("4 - Cadastrar Funcionárioo");

        int escolha = sc.nextInt();
        sc.nextLine();

        switch (escolha) {
            case 1 -> cadastrarLivro(sc);
            case 2 -> cadastrarEditora(sc);
            case 3 -> cadastrarUsuario(sc);
            case 4 -> cadastrarFuncionario(sc);
            default -> System.out.println("Opção inválida,");
        }
    }

    public static void cadastrarLivro(Scanner sc) {
        Livro livro = new Livro();
        Editora editora = new Editora();
        String cont;

        do {
            System.out.println("Qual o ISBN do livro?");
            livro.setISBN(sc.nextInt());
            sc.nextLine();

            System.out.println("Qual o número de páginas do livro?");
            livro.setnPaginas(sc.nextInt());
            sc.nextLine();

            System.out.println("Qual o título do livro?");
            livro.setTitulo(sc.nextLine());

            System.out.println("Qual o autor do livro?");
            livro.setAutor(sc.nextLine());

            System.out.println("Qual o número de exemplares iguais?");
            livro.setExemplares(sc.nextInt());
            sc.nextLine();

            System.out.println("Qual a editora do livro?");
            System.out.println("Digite o CNPJ da editora:");
            editora.setCNPJ(sc.nextLine());
            System.out.println("Digite o nome fantasia da editora:");
            editora.setNomeFantasia(sc.nextLine());
            livro.setEditora(editora.getNomeFantasia());

            System.out.println(livro);

            System.out.println("Você quer continuar S ou N?");
            cont = sc.nextLine();
        } while (cont.equalsIgnoreCase("S"));
    }

    public static void cadastrarEditora(Scanner sc) {
        Editora editora = new Editora();
        String cont;

        do {
            System.out.println("Digite o CNPJ da editora:");
            editora.setCNPJ(sc.nextLine());
            System.out.println("Digite o nome fantasia da editora:");
            editora.setNomeFantasia(sc.nextLine());

            System.out.println(editora);

            System.out.println("Você quer continuar S ou N?");
            cont = sc.nextLine();
        } while (cont.equalsIgnoreCase("S"));
    }

    public static void cadastrarUsuario(Scanner sc) {
        Pessoa usuario = new Usuario("id", "nome", "endereco", "telefones");
        String cont;

        do {
            System.out.println("Digite o ID do usuário:");
            usuario.setId(sc.nextLine());
            System.out.println("Digite o nome do usuário:");
            usuario.setNome(sc.nextLine());
            System.out.println("Digite o endereço do usuário:");
            usuario.setEndereco(sc.nextLine());
            System.out.println("Digite os telefones do usuário:");
            usuario.setTelefones(sc.nextLine());
            System.out.println("Digite o login do usuário:");
            ((Usuario) usuario).setLogin(sc.nextLine());
            System.out.println("Digite a senha do usuário:");
            ((Usuario) usuario).setSenha(sc.nextLine());

            System.out.println(usuario);

            System.out.println("Você quer continuar S ou N?");
            cont = sc.nextLine();
        } while (cont.equalsIgnoreCase("S"));
    }

    public static void cadastrarFuncionario(Scanner sc) {
     Pessoa funcionario = new Funcionarios("id", "nome", "endereco", "telefones");
        String cont;

        do {
            System.out.println("Digite o ID do funcionárioo:");
            funcionario.setId(sc.nextLine());
            System.out.println("Digite o nome do funcionário:");
            funcionario.setNome(sc.nextLine());
            System.out.println("Digite o endereço do funcionário:");
            funcionario.setEndereco(sc.nextLine());
            System.out.println("Digite os telefones do funcionário:");
            funcionario.setTelefones(sc.nextLine());
            System.out.println("Digite o salário do funcionário:");
             ((Funcionarios)funcionario).setSalario(sc.nextDouble());
            sc.nextLine(); 
            System.out.println("Digite os dados da carteira funcional:");
            ((Funcionarios) funcionario).setDadosCarteira(sc.nextLine());

            System.out.println(funcionario);

            System.out.println("Você quer continuar S ou N?");
            cont = sc.nextLine();
        } while (cont.equalsIgnoreCase("S"));
    }
}
