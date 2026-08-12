package construtores;

public class Drone {
    int identificador;
    double raiokm;
    int bateria;
    
    public Drone(int identificador, double raiokm, int bateria) {
        this.identificador = identificador;
        this.raiokm = raiokm;
        this.bateria = bateria;
    }
    
    public void voar() {
        if (this.bateria > 10) {
            System.out.println("Drone #" + this.identificador + " em voo. Raio de cobertura: " + this.raiokm + " km.");
            this.bateria -= 10;
        } else {
            System.out.println("Drone #" + this.identificador + " com bateria muito baixa para voar!");
        }
    }

    public void subir() {
        System.out.println("Drone #" + this.identificador + " subindo altitude...");
    }

    public void descer() {
        System.out.println("Drone #" + this.identificador + " descendo para pouso. Bateria restante: " + this.bateria + "%");
    }
}
