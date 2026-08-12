package construtores;

public class Filme {
    String nome;
    int duracaoM;
    String genero;
    boolean disponivel;
    
    public Filme(String nome, int duracaoM, String genero, boolean disponivel){
        this.nome = nome;
        this.duracaoM = duracaoM;
    }
    
    public void pausar(){
        System.out.println("Filme " + this.nome + " pausado.");
    }
    public void avancar(){
        System.out.println("Avançando 10 segundos em " + this.nome + "...");
    }
    public void retroceder(){
        System.out.println("Retrocedendo 10 segundos em " + this.nome + "...");
    }
    public void voltar(){
        System.out.println("Voltando ao menu principal.");
    }
    public void iniciar(){
        if (this.disponivel) {
            System.out.println("Iniciando o filme: " + this.nome + " (" + this.genero + " - " + this.duracaoM + " min)");
        } else {
            System.out.println("O filme " + this.nome + " não está disponível no catálogo.");
        }
    }
}
