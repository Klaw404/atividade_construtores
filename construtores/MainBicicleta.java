package construtores;

public class MainBicicleta {
    public static void main(String[] args) {
        Bicicleta bike1 = new Bicicleta("Caloi", 1500.0, 25.0, true);
        Bicicleta bike2 = new Bicicleta("Sense", 3200.0, 35.0, false);

        System.out.println("--- Teste Bicicleta 1 ---");
        bike1.alugar();
        bike1.vender();

        System.out.println("\n--- Teste Bicicleta 2 ---");
        bike2.vender();
        bike2.alugar();
    }
}