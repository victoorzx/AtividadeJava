public class Livro extends Produto {
    private String autor;
    private int numeroPaginas;
    private boolean capaDura;

    public Livro(String nome, double preco, String autor, int numeroPaginas, boolean capaDura) {
        super(nome, preco);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.capaDura = capaDura;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);
        System.out.println("Capa dura: " + (capaDura ? "Sim" : "Não"));
    }
}
