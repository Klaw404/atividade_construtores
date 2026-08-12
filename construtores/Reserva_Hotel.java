package construtores;

public class Reserva_Hotel {
    int quarto;
    String cliente;
    boolean refeicao;
    double valor;
    
    public Reserva_Hotel(int quarto, String cliente, boolean refeicao, double valor) {
        this.quarto = quarto;
        this.cliente = cliente;
        this.refeicao = refeicao;
        this.valor = valor;
    }

    public void reservar() {
        System.out.println("Reserva realizada para " + this.cliente + " no quarto " + this.quarto + ".");
        if (this.refeicao) {
            System.out.println("Incluso: Café da manhã/Refeição.");
        }
    }

    public void cancelar() {
        System.out.println("A reserva do cliente " + this.cliente + " no quarto " + this.quarto + " foi cancelada.");
    }

    public void confPag() {
        System.out.println("Pagamento de R$ " + this.valor + " confirmado para o cliente " + this.cliente + ".");
    }
}
