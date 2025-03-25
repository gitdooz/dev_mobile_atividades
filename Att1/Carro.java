package Att1;

public class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(String cor, String modelo, int ano, int numeroPortas) {
        super(cor, modelo, ano);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public String mostrarDetalhes() {
        return "A Cor é: " + getCor() + ", O Modelo é: " + getModelo() + ", O Ano é: " + getAno();
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }
}

