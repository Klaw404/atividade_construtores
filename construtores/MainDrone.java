package construtores;

public class MainDrone {
    public static void main(String[] args) {
        Drone drone1 = new Drone(101, 12.5, 85);
        Drone drone2 = new Drone(202, 5.0, 8);

        System.out.println("--- Drone 101 ---");
        drone1.voar();
        drone1.subir();
        drone1.descer();

        System.out.println("\n--- Drone 202 ---");
        drone2.voar();
        drone2.descer();
    }
}