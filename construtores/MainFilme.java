package construtores;

public class MainFilme {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Inception", 148, "Ficção Científica", true);
        Filme filme2 = new Filme("O Chefão", 175, "Drama", false);
        Filme filme3 = new Filme("Matrix", 136, "Ação", true);

        System.out.println("--- Filme 1 ---");
        filme1.iniciar();
        filme1.avancar();
        filme1.pausar();

        System.out.println("\n--- Filme 2 ---");
        filme2.iniciar();

        System.out.println("\n--- Filme 3 ---");
        filme3.iniciar();
        filme3.retroceder();
        filme3.voltar();
    }
}