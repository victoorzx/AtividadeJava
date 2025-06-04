public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Down With the System", 99.90, "Serj Tankian", 350, true);
        VideoGame videoGame = new VideoGame("PlayStation 5", 4299.99, "Sony", "PS5", true);

        System.out.println("=== Livro ===");
        livro.exibirInfo();

        System.out.println("\n=== Video Game ===");
        videoGame.exibirInfo();
    }
}
