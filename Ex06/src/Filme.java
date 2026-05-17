public class Filme {
    public String titulo;
    public String diretor;
    public int anoLancamento;
    public int duracao;
    public double nota;

    public String duracaoFormatada() {
        return (duracao / 60) + "h " + (duracao % 60) + "m";
    }

    public boolean recomendado() {
        return nota >= 7.0;
    }

    public void exibirDetalhes() {
        System.out.println("====== Detalhes do Filme ======");
        System.out.println("Título: " + titulo + " (" + anoLancamento + ")");
        System.out.println("Diretor: " + diretor);
        System.out.println("Duração: " + duracaoFormatada());
        System.out.printf("Nota: %.1f ★%n", nota);
        System.out.println("Recomendado: " + (recomendado() ? "SIM" : "NÃO"));
        System.out.println("===============================");
    }
}
