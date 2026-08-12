package construtores;

public class MainReserva {
    public static void main(String[] args) {
        Reserva_Hotel reserva1 = new Reserva_Hotel(302, "Carlos Silva", true, 450.0);
        Reserva_Hotel reserva2 = new Reserva_Hotel(105, "Mariana Souza", false, 200.0);

        System.out.println("--- Reserva 1 ---");
        reserva1.reservar();
        reserva1.confPag();

        System.out.println("\n--- Reserva 2 ---");
        reserva2.reservar();
        reserva2.cancelar();
    }
}
