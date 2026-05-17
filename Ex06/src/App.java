import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Filme filme = new Filme();

        System.out.println("Título do filme: ");
        filme.titulo = scanner.nextLine();

        System.out.println("Diretor: ");
        filme.diretor = scanner.nextLine();

        System.out.println("Ano de lançamento: ");
        filme.anoLancamento = scanner.nextInt();

        System.out.println("Duração (em minutos): ");
        filme.duracao = scanner.nextInt();

        System.out.println("Nota (0 a 10): ");
        filme.nota = scanner.nextDouble();

        filme.exibirDetalhes();

        scanner.close();
    }
}
