package Att1;

// Bicicleta.java
public class Bicicleta extends Veiculo {
    private boolean temCesta;

    public Bicicleta(String cor, String modelo, int ano, boolean temCesta) {
        super(cor, modelo, ano);  // Chama o construtor da classe mãe
        this.temCesta = temCesta;
    }

    @Override
    public String mostrarDetalhes() {
        return "A Cor é: " + getCor() + ", O Modelo é: " + getModelo() + ", O Ano é: " + getAno();
    }

    public boolean isTemCesta() {
        return temCesta;
    }

    public void setTemCesta(boolean temCesta) {
        this.temCesta = temCesta;
    }
}

