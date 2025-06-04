public class VideoGame extends Produto {
    private String marca;
    private String modelo;
    private boolean possuiControleExtra;

    public VideoGame(String nome, double preco, String marca, String modelo, boolean possuiControleExtra) {
        super(nome, preco);
        this.marca = marca;
        this.modelo = modelo;
        this.possuiControleExtra = possuiControleExtra;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Controle extra: " + (possuiControleExtra ? "Sim" : "Não"));
    }
}
