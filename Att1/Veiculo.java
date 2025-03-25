package Att1;

public abstract class Veiculo extends IVeiculos {
    private String cor;
    private String modelo;
    private int ano;

    // Construtor da classe Veiculo
    public Veiculo(String cor, String modelo, int ano) {
        this.cor = cor;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Métodos Getter e Setter para as variáveis
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
}
