package construtores;

public class Bicicleta {
    String marca;
    double valor;
    double velocidade;
    boolean AVenda;
    
    public Bicicleta(String marca, double valor, double velocidade, boolean AVenda){
        this.marca = marca;
        this.valor = valor;
        this.velocidade = velocidade;
        this.AVenda = AVenda;
    }
    
    public void vender(){
        if (this.AVenda) {
            this.AVenda = false;
            System.out.println("A bicicleta " + this.marca + " foi vendida pelo valor de R$ " + this.valor + "!");
        } else {
            System.out.println("A bicicleta " + this.marca + " não está disponível para venda.");
        }
    }
    public void alugar(){
        System.out.println("Bicicleta " + this.marca + " alugada com sucesso! Velocidade máxima: " + this.velocidade + " km/h.");
    }
}
